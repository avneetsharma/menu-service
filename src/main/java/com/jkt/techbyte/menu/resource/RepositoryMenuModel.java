package com.jkt.techbyte.menu.resource;

public class RepositoryMenuModel {

	private long menuId;
	private String menuName;
	private long menuParentId;
	

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

	

}
