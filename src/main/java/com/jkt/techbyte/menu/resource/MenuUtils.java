package com.jkt.techbyte.menu.resource;


import java.util.ArrayList;
import java.util.List;
public class MenuUtils {

	public static UserResponce prepareUserMenus(List<RepositoryMenuModel> menuModelDaoList) {
		UserMenuModel userMenuModel;
		List<UserMenuModel> parentUserMenusList = new ArrayList<UserMenuModel>();
		for (RepositoryMenuModel menuModelDao : menuModelDaoList) {
			userMenuModel = new UserMenuModel();
			if (menuModelDao.getMenuParentId() == 0) {
				userMenuModel.setMenuId(menuModelDao.getMenuId());
				userMenuModel.setMenuName(menuModelDao.getMenuName());
				userMenuModel.setMenuParentId(menuModelDao.getMenuParentId());
				parentUserMenusList.add(userMenuModel);
			}
		}
		List<UserMenuModel> userMenuList=addSubMenu(menuModelDaoList,parentUserMenusList);
		return new UserResponce(userMenuList);
	}

	private static List<UserMenuModel> addSubMenu(List<RepositoryMenuModel> menuModelDaoList,
			List<UserMenuModel> parentUserMenusList) {
		List<UserMenuModel> childrens ;
		if(!menuModelDaoList.isEmpty()) {
			for (UserMenuModel  userMenuModel : parentUserMenusList) {
				childrens=new ArrayList<UserMenuModel>();
				for(RepositoryMenuModel menuModelDao: menuModelDaoList) {
					if(userMenuModel.getMenuId()==menuModelDao.getMenuParentId()) {
						UserMenuModel userMenuModelObj= new UserMenuModel();
						userMenuModelObj.setMenuId(menuModelDao.getMenuId());
						userMenuModelObj.setMenuName(menuModelDao.getMenuName());
						userMenuModelObj.setMenuParentId(menuModelDao.getMenuParentId());
						childrens.add(userMenuModelObj);
					}
					
				}
				userMenuModel.setSubMenus(childrens);
				addSubMenu(menuModelDaoList, childrens);
			}
		}
		return parentUserMenusList;
	}

}
