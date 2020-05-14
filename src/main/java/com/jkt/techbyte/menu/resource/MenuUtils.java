package com.jkt.techbyte.menu.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MenuUtils {

    public static UserResponce prepareUserMenu(List<RepositoryMenuModel> menuModelDaoList) {

        List<UserMenuModel> parentUserMenusList = menuModelDaoList.stream()
                .filter(obj -> obj.getMenuParentId()==0)
                .map(obj -> new UserMenuModel(obj))
                .collect(Collectors.toList());
        List<UserMenuModel> userMenuList = addSubMenu(menuModelDaoList, parentUserMenusList);
        return new UserResponce(userMenuList);
    }

    private static List<UserMenuModel> addSubMenu(List<RepositoryMenuModel> menuModelDaoList,
                                                  List<UserMenuModel> parentUserMenusList) {
        List<UserMenuModel> subMenu;
        if (!menuModelDaoList.isEmpty()) {
            for (UserMenuModel userMenuModel : parentUserMenusList) {
                subMenu = new ArrayList<UserMenuModel>();
                for (RepositoryMenuModel repositoryMenuModel : menuModelDaoList) {
                    if (userMenuModel.getMenuId() == repositoryMenuModel.getMenuParentId()) {
                        UserMenuModel userMenuModelObj = new UserMenuModel(repositoryMenuModel);
                        subMenu.add(userMenuModelObj);
                    }
                }
                userMenuModel.setSubMenus(subMenu);
                addSubMenu(menuModelDaoList, subMenu);
            }
        }
        return parentUserMenusList;
    }

}
