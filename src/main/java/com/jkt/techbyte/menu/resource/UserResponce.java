package com.jkt.techbyte.menu.resource;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class UserResponce {
	private String menuName;
	private List<UserMenuModel> subMenus;
	
	public UserResponce(List<UserMenuModel> userMenuList) {
		//this.menuName=name;
		this.subMenus=userMenuList;
	}

}
