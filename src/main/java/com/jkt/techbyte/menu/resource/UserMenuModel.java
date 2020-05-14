package com.jkt.techbyte.menu.resource;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserMenuModel {
	private long menuId;
	private String menuName;
	private long menuParentId;
	private List<UserMenuModel> subMenus;
}
