package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.data.AssetDataManager;
import com.fatwire.assetapi.def.AssetTypeDefManager;
import com.fatwire.assetapi.site.SiteManager;
import com.fatwire.system.Session;
import com.fatwire.system.SessionFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import wcs.api.Log;
import wcs.core.tag.UserTag;
import wcs.java.Env;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Imports basic assets for a site
 *
 * @author msciab
 */
public class BasicAssetImporter {

    private static Log log = Log.getLog(Env.class);

    /**
     * The basic asset importer for the site
     */
    public BasicAssetImporter() {
    }


    public String setup(ICS ics, String username, String password, String sitename) throws Exception {


        UserTag.login().username(username).password(password).run(ics);
        Session ses = SessionFactory.newSession(username, password);
        AssetTypeDefManager atdm = (AssetTypeDefManager)ses.getManager(AssetTypeDefManager.class.getName());
        StringBuilder sb = new StringBuilder();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(this.getClass().getClassLoader());
        Resource[] resources = resolver.getResources(String.format("/**/%s/*.xml", sitename));
        for (Resource resource : resources) {
            String filename = resource.getFilename();
            String assetName = filename.substring(0, filename.lastIndexOf('.'));
            BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line.trim());
            }
            atdm.createAssetMakerAssetType(assetName, filename,
                    sb.toString(), false, false);
        }
        return sb.toString();

    }

}
