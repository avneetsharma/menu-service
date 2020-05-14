package com.jkt.techbyte.menu.resource;

import java.util.List;

public class UserResponce {
	private List<UserMenuModel> userMenu;
	
	public UserResponce(List<UserMenuModel> userMenuList) {
		this.userMenu=userMenuList;
	}

	public List<UserMenuModel> getUserMenu() {
		return userMenu;
	}

	public void setUserMenu(List<UserMenuModel> userMenu) {
		this.userMenu = userMenu;
	}
}
