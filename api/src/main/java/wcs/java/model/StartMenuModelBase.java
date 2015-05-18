package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.data.AssetDataManager;
import com.openmarket.basic.interfaces.AssetException;
import com.openmarket.xcelerate.common.RoleList;
import com.openmarket.xcelerate.common.SiteList;
import com.openmarket.xcelerate.interfaces.*;
import com.openmarket.xcelerate.startmenu.InputArgList;
import wcs.api.Arg;
import wcs.java.model.enums.AssetTypeNames;
import wcs.java.model.enums.StartMenuTypeEnum;
import wcs.java.util.IdBeautifier;
import wcs.java.util.StringUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * Base of start menu classes
 * 
 * @author jelerak
 * 
 */
public class StartMenuModelBase extends ModelBase {

	private List<StartMenu> menuItems = new LinkedList<StartMenu>();

    public void createDefaultStartMenus() {
        for (AssetTypeNames assetTypeNames : AssetTypeNames.values()) {
            String menuName = "New " + assetTypeNames.toString();
            long id = IdBeautifier.generateUniqueStartMenuId(StringUtils.capitalize(menuName));
            StartMenu smNew = new StartMenu(id, menuName, menuName, StartMenuTypeEnum.MENU_TYPE_NEW.toString(), assetTypeNames.toString(),"");
            menuItems.add(smNew);
            menuName = "Find " + assetTypeNames.toString();
            id = IdBeautifier.generateUniqueStartMenuId(StringUtils.capitalize(menuName));
            StartMenu smFind = new StartMenu(id, menuName, menuName, StartMenuTypeEnum.MENU_TYPE_FIND.toString(), assetTypeNames.toString(),"");
            menuItems.add(smFind);
        }
    }

	public StartMenu startMenu(String type, DefinitionContainer dc, String subtype) {
		StartMenu sm = new StartMenu(type, dc, subtype);
		menuItems.add(sm);
		return sm;
	}

	public StartMenu startMenu(long id, String name, String description, String type, String assetType, String assetSubtype) {
		StartMenu sm = new StartMenu(id,name,description,type,assetType,assetSubtype);
		menuItems.add(sm);
		return sm;
	}

    public StartMenu startMenu(String type, DefinitionContainer dc, String subtype, Arg... args) {
        StartMenu sm = new StartMenu(type, dc, subtype, args);
        menuItems.add(sm);
        return sm;
    }

	@Override
	List<HasSetData> getAssetData() {
		return null;  // not used by this build
	}

	@Override
	public String build(String sitename, long baseid, AssetDataManager adm, ICS ics) {
		ISiteList siteList  =new SiteList();
		siteList.addSite(Long.parseLong(ics.GetSSVar("pubid")));
		IRoleList roleList = new RoleList();
		roleList.addRole("");
		StringBuilder sb = new StringBuilder();
		String prefix = sitename + "_";
		for (StartMenu menuItem : menuItems) {
			sb.append("START MENU " + menuItem.getDescription());
			try {

				IStartMenu menu = StartMenuFactory.make(ics);
				// finds an existing startMenuItem or returns a new one
				IStartMenuItem startMenuItem = menu.getMenuItemName(menuItem.getName(),menuItem.getType());
				if (startMenuItem.getID() == null) {
					sb.append(" INSERT: ");
				}
				else {
					sb.append(" UPDATE: ");
				}
				startMenuItem.setName(menuItem.getName());
				startMenuItem.setDescription(menuItem.getDescription());
				startMenuItem.setItemType(menuItem.getType());
				startMenuItem.setAssetType(menuItem.getAssetType());
				String assetSubtype = menuItem.getAssetSubtype();
				if (!assetSubtype.startsWith(prefix) && assetSubtype.length() > 0)
					assetSubtype = prefix + assetSubtype;

				startMenuItem.setAssetSubtype(assetSubtype);
				startMenuItem.setLegalSites(siteList);
				startMenuItem.setLegalRoles(roleList);

				IArgumentList argumentList = startMenuItem.getArguments();
                if (argumentList.get("subtype") == null) {
                    argumentList.set("subtype", assetSubtype);
                }
                if (menuItem.arguments != null) {
                    for (Arg argument : menuItem.arguments) {
                        IArgument arg = argumentList.get(argument.name);
                        if (arg != null)
                            argumentList.delete(argument.name);
                        argumentList.set(argument.name,argument.value);
                    }
                }
				IInputArgList inputArgList = new InputArgList();
				inputArgList.add("subtype",false);
				inputArgList.add("Group_%", false);
				startMenuItem.setLegalArguments(inputArgList);
				menu.setMenuItem(startMenuItem);
				sb.append(" OK\n");
			} catch (AssetException e) {
				e.printStackTrace();
				sb.append(" ERR " + e.getMessage() + "\n");
			}
		}
		return sb.toString() ;
	}
}
