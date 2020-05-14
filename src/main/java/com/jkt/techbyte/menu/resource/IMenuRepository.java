package com.jkt.techbyte.menu.resource;

import com.jkt.techbyte.menu.resource.RepositoryMenuModel;

import java.util.List;

public interface IMenuRepository{

	  List<RepositoryMenuModel> getAllMenus(int userRoleId) throws Exception;
  
}
