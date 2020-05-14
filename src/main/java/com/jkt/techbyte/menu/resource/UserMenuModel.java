package com.jkt.techbyte.menu.resource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserMenuModel {
	private long menuId;
	private String menuName;
	private long menuParentId;
	private List<UserMenuModel> subMenus;

	public UserMenuModel(RepositoryMenuModel menuModelDao){
		this.menuId= menuModelDao.getMenuId();
		this.menuName= menuModelDao.getMenuName();
		this.menuParentId= menuModelDao.getMenuParentId();
	}
}
