package com.jkt.techbyte.menu.resource;

import java.util.List;

public class UserMenuModel {

	private long menuId;
	private String menuName;
	private long menuParentId;
	private List<UserMenuModel> subMenus;

	public long getMenuId() {
		return menuId;
	}

	public void setMenuId(long menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public long getMenuParentId() {
		return menuParentId;
	}

	public void setMenuParentId(long menuParentId) {
		this.menuParentId = menuParentId;
	}

	public List<UserMenuModel> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<UserMenuModel> subMenus) {
		this.subMenus = subMenus;
	}

	

}
