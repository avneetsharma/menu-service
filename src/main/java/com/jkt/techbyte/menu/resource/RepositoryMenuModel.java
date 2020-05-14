package com.jkt.techbyte.menu.resource;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RepositoryMenuModel {
	private long menuId;
	private String menuName;
	private long menuParentId;
}
