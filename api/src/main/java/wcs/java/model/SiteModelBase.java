package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.data.AssetDataManager;
import com.fatwire.assetapi.def.AssetTypeDefManager;
import com.fatwire.assetapi.site.Site;
import com.fatwire.assetapi.site.SiteImpl;
import com.fatwire.assetapi.site.SiteInfo;
import com.fatwire.assetapi.site.SiteManager;
import com.fatwire.system.Session;
import com.fatwire.system.SessionFactory;
import wcs.core.tag.UserTag;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SiteModelBase {

    private long id;
    private String name;
    private String description;

    public SiteModelBase(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    List<String> assetTypes = null;

    public void setAssetTypes(String... _assetTypes) {
        assetTypes = Arrays.asList(_assetTypes);
    }

    Map<String, List<String>> userRoles = new HashMap<String, List<String>>();

    public void addUserRoles(String user, String... _userRoles) {
        userRoles.put(user, Arrays.asList(_userRoles));
    }

    AttributeModelBase[] attributes = null;

    public void setAttributes(AttributeModelBase... attributeModels) {
        attributes = attributeModels;
    }

    DefinitionModelBase[] definitions = null;

    public void setDefinitions(DefinitionModelBase... definitionModels) {
        definitions = definitionModels;
    }

    FilterModelBase[] filters = null;

    public void setFilters(FilterModelBase... filterModel) {
        filters = filterModel;
    }

    StartMenuModelBase[] startMenus = null;

    public void setStartMenuItems(StartMenuModelBase... startMenuModel) {
        startMenus = startMenuModel;
    }

    FlexFamilyModelBase[] families = null;

    public void setFlexFamilies(FlexFamilyModelBase... _flexFamilies) {
        families = _flexFamilies;
    }

    public String setup(ICS ics, String username, String password) {
        UserTag.login().username(username).password(password).run(ics);
        Session ses = SessionFactory.newSession(username, password);
        SiteManager sim = (SiteManager) ses.getManager(SiteManager.class
                .getName());
        AssetDataManager adm = (AssetDataManager) ses
                .getManager(AssetDataManager.class.getName());

        AssetTypeDefManager atdm = (AssetTypeDefManager) ses
                .getManager(AssetTypeDefManager.class.getName());

        StringBuilder sb = new StringBuilder();

        sb.append("\n=== FLEX FAMILIES ===\n");
        for (FlexFamilyModelBase flexFamilyModel : families) {
            sb.append(flexFamilyModel.build(ics)).append("\n");
        }

        sb.append("\n=== SITE ===\n");
        sb.append(build(ics, sim, atdm)).append("\n");

        sb.append("\n=== ATTRIBUTES ===\n");
        for (AttributeModelBase attributeModel : attributes)
            sb.append(attributeModel.build(name, id, adm, ics)).append("\n");

        sb.append("\n=== DEFINITIONS ===\n");
        for (DefinitionModelBase definitionModel : definitions)
            sb.append(definitionModel.build(name, id, adm, ics)).append("\n");

        sb.append("\n=== START MENUS ===\n");
        for (StartMenuModelBase menuItemModel : startMenus)
            sb.append(menuItemModel.build(name, id, adm, ics)).append("\n");

        return sb.toString();
    }

    // build the site
    private String build(ICS ics, SiteManager sim, AssetTypeDefManager atdm) {
        StringBuffer msg = new StringBuffer();

        Site site = new SiteImpl();
        site.setId(id);
        site.setName(name);
        site.setDescription(description);
        site.setAssetTypes(assetTypes);
        for (String user : userRoles.keySet())
            site.setUserRoles(user, userRoles.get(user));

        File base = new File(ics.GetProperty("xcelerate.defaultbase",
                "futuretense_xcel.ini", true));

        try {
            File statics = new File(base, "Static");
            StringBuilder sb = new StringBuilder();
            sb.append("<?xml version=\"1.0\" ?>\n");
            sb.append("<ASSET NAME=\"Static\" DESCRIPTION=\"Static\" DEFDIR=\"").append(statics.getAbsolutePath()).append("\">\n");
            sb.append("    <PROPERTIES>\n");
            sb.append("        <PROPERTY NAME=\"URL\" DESCRIPTION=\"URL\">\n");
            sb.append("            <STORAGE TYPE=\"VARCHAR\" LENGTH=\"255\" />\n");
            sb.append("            <INPUTFORM TYPE=\"UPLOAD\" WIDTH=\"64\" LINKTEXT=\"Url\" REQUIRED=\"YES\"/>\n");
            sb.append("        </PROPERTY>\n");
            sb.append("        <PROPERTY NAME=\"FILEPATH\" DESCRIPTION=\"FILEPATH\">\n");
            sb.append("            <STORAGE TYPE=\"VARCHAR\" LENGTH=\"512\"/>\n");
            sb.append("            <INPUTFORM TYPE=\"TEXT\" DESCRIPTION=\"FILE PATH\" REQUIRED=\"YES\"/>\n");
            sb.append("            <SEARCHFORM TYPE=\"TEXT\" DESCRIPTION=\"FILE PATH\"/>\n");
            sb.append("            <SEARCHRESULTS INCLUDE=\"TRUE\"/>\n");
            sb.append("        </PROPERTY>\n");
            sb.append("        <PROPERTY NAME=\"HASH\" DESCRIPTION=\"HASH\">\n");
            sb.append("            <STORAGE TYPE=\"VARCHAR\" LENGTH=\"32\"/>\n");
            sb.append("            <INPUTFORM TYPE=\"TEXT\" DESCRIPTION=\"HASH\" REQUIRED=\"YES\"/>\n");
            sb.append("            <SEARCHFORM TYPE=\"TEXT\" DESCRIPTION=\"HASH\"/>\n");
            sb.append("            <SEARCHRESULTS INCLUDE=\"TRUE\"/>\n");
            sb.append("        </PROPERTY>\n");
            sb.append("        <PROPERTY NAME=\"HASHFILEPATH\" DESCRIPTION=\"HASHFILEPATH\">\n");
            sb.append("            <STORAGE TYPE=\"VARCHAR\" LENGTH=\"512\"/>\n");
            sb.append("            <INPUTFORM TYPE=\"TEXT\" DESCRIPTION=\"HASH FILE PATH\" REQUIRED=\"YES\"/>\n");
            sb.append("            <SEARCHFORM TYPE=\"TEXT\" DESCRIPTION=\"HASH FILE PATH\"/>\n");
            sb.append("            <SEARCHRESULTS INCLUDE=\"TRUE\"/>\n");
            sb.append("        </PROPERTY>\n");
            sb.append("        <PROPERTY NAME=\"MIMETYPE\" DESCRIPTION=\"MIMETYPE\">\n");
            sb.append("            <STORAGE TYPE=\"VARCHAR\" LENGTH=\"255\"/>\n");
            sb.append("            <INPUTFORM TYPE=\"TEXT\" DESCRIPTION=\"MIMETYPE\" REQUIRED=\"YES\"/>\n");
            sb.append("            <SEARCHFORM TYPE=\"TEXT\" DESCRIPTION=\"MIMETYPE\"/>\n");
            sb.append("            <SEARCHRESULTS INCLUDE=\"TRUE\"/>\n");
            sb.append("        </PROPERTY>\n");
            sb.append("    </PROPERTIES>\n");
            sb.append("</ASSET>\n");
            statics.mkdirs();

            atdm.createAssetMakerAssetType("Static", "Static.xml",
                    sb.toString(), false, false);
            msg.append("AssetMaker: Static\n");
        } catch (AssetAccessException e1) {
            // System.out.println(e1.getMessage());
            // e1.printStackTrace();
            msg.append("AssetMaker: Static: Error: ").append(e1.getMessage()).append("\n");
        }

        try {
            File jars = new File(base, "Jar");
            StringBuilder sb = new StringBuilder();
            sb.append("<?xml version=\"1.0\" ?>\n");
            sb.append("<ASSET NAME=\"Jar\" DESCRIPTION=\"Jar\" DEFDIR=\"").append(jars.getAbsolutePath()).append("\">\n");
            sb.append("    <PROPERTIES>\n");
            sb.append("        <PROPERTY NAME=\"URL\" DESCRIPTION=\"URL\">\n");
            sb.append("            <STORAGE TYPE=\"VARCHAR\" LENGTH=\"255\" />\n");
            sb.append("            <INPUTFORM TYPE=\"UPLOAD\" WIDTH=\"64\" LINKTEXT=\"Url\" REQUIRED=\"YES\"/>\n");
            sb.append("        </PROPERTY>\n");
            sb.append("    </PROPERTIES>\n");
            sb.append("</ASSET>\n");
            jars.mkdirs();
            atdm.createAssetMakerAssetType("Jar", "Jar.xml",
                    sb.toString(), false, false);

            //msg.append(sb.toString());
            msg.append("AssetMaker: Jar\n");

        } catch (AssetAccessException e1) {
            // System.out.println(e1.getMessage());
            // e1.printStackTrace();
            msg.append("AssetMaker: Jar: Error: ").append(e1.getMessage()).append("\n");
        }

        // System.out.println("asset types:"+assetTypes);
        try {
            boolean exist = false;
            for (SiteInfo sif : sim.list())
                if (sif.getId().equals(site.getId()))
                    exist = true;
            if (!exist)
                sim.create(Arrays.asList(site));
            sim.update(Arrays.asList(site));
            msg.append((exist ? "UPDATED: " : "CREATED: ") + site.getName());
            return msg.toString();
        } catch (Exception e) {
            // e.printStackTrace();
            return "ERROR: " + e.getMessage();
        }
    }
}
