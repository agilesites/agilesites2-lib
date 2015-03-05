package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.common.AssetNotExistException;
import com.fatwire.assetapi.data.AssetDataManager;
import com.fatwire.assetapi.data.AssetId;
import com.openmarket.basic.interfaces.AssetException;
import com.openmarket.xcelerate.common.ArgumentList;
import com.openmarket.xcelerate.common.RoleList;
import com.openmarket.xcelerate.common.SiteList;
import com.openmarket.xcelerate.interfaces.*;
import com.openmarket.xcelerate.startmenu.InputArgList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Base of attribute model classes
 * 
 * @author msciab
 * 
 */
public class StartMenuModelBase extends ModelBase {

	private List<StartMenu> menuItems = new LinkedList<>();

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


	@Override
	List<HasSetData> getAssetData() {
		return null;  // not used by this build
	}

	@Override
	public String build(String sitename, long baseid, AssetDataManager adm, ICS ics) {
		System.out.println("building start menus");
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
				if (!assetSubtype.startsWith(prefix))
					assetSubtype = prefix + assetSubtype;

				startMenuItem.setAssetSubtype(assetSubtype);
				startMenuItem.setLegalSites(siteList);
				startMenuItem.setLegalRoles(roleList);

				IArgumentList argumentList = new ArgumentList();
				argumentList.set("subtype", assetSubtype);
				startMenuItem.setArguments(argumentList);

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
