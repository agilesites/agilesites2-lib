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

    BasicAssetModelBase[] basicAssets = null;

    public void setBasicAssets(BasicAssetModelBase... basicAssetsModels) {
        basicAssets = basicAssetsModels;
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

        sb.append("\n=== BASIC ASSETS ===\n");
        for (BasicAssetModelBase basicAsset : basicAssets) {
            sb.append(basicAsset.build(ics, atdm, name)).append("\n");
        }

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
