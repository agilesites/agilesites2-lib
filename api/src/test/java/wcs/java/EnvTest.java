package wcs.java;

import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Interfaces.IList;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import wcs.api.*;
import wcs.api.Config;
import wcs.api.Router;
import wcs.core.WCS;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(WCS.class)
public class EnvTest {
    private static final String EMBEDDED_ASSET = "<div>\n" +
            "\t<strong>test News Article 1 body</strong><br />\n" +
            "\t<span id=\"_CSEMBEDTYPE_=inclusion&amp;_PAGENAME_=Telmore%2FTelmore_Content%2FTelmore_NewsArticleDetail&amp;_cid_=1409669379678&amp;_c_=Telmore_Content&amp;_deps_=exists\"><i>[Asset Included(Id:1409669379678;Type:Telmore_Content)]</i></span>\n" +
            "\t<div>\n" +
            "\t\t&nbsp;</div>\n" +
            "\n" +
            "\t<span id=\"_CSEMBEDTYPE_=inclusion&amp;_PAGENAME_=Telmore%2FTelmore_Content%2FTelmore_NewsArticleDetail&amp;_cid_=1409669452569&amp;_c_=Telmore_Content&amp;_deps_=exists\"><i>[Asset Included(Id:1409669452569;Type:Telmore_Content)]</i></span></div>";

    private static final String EMBEDDED_LINK = "<div>\n" +
            "\t<strong>test News Article 1 <a href=\"_CSEMBEDTYPE_=internal&amp;_WRAPPER_=Telmore&amp;_PAGENAME_=Telmore%2FTelmore_Content%2FTelmore_NewsArticleLayout&amp;_cid_=1409669379678&amp;_c_=Telmore_Content\">body</a></strong></div>\n" +
            "<div>\n" +
            "\t&nbsp;</div>";

    Env e;
    ICS ics;

    @Before
    public void setUp() throws Exception {
        IList ilist = mock(IList.class);
        when(ilist.getValue("embeddedAsset")).thenReturn(EMBEDDED_ASSET);
        when(ilist.getValue("embeddedLink")).thenReturn(EMBEDDED_LINK);
        when(ilist.numRows()).thenReturn(1);
        ics = mock(ICS.class);
        when(ics.GetVar("site")).thenReturn("TestSite");
        when(ics.GetList(anyString())).thenReturn(ilist);

        PowerMockito.mockStatic(WCS.class);
        Router router = mock(Router.class);
        when(router.link(any(Env.class),any(Id.class))).thenReturn("/TestPage");
        Config config = mock(Config.class);
        when(WCS.getRouter(ics)).thenReturn(router);
        when(WCS.getConfig(ics)).thenReturn(config);
        when(WCS.normalizeSiteName(anyString())).thenReturn("testsite");

    }

    @org.junit.Test
    public void testGetEmbeddedAsset() throws Exception {
        Env e = new Env(ics);
        String val = e.getString("testList", "embeddedAsset");
        assertTrue(val.contains("RENDER:CALLTEMPLATE"));
    }

}