package com.jkt.techbyte.menu.resource;

import java.util.List;

public interface IMenuRepository{
	  List<RepositoryMenuModel> findByUserRoleId(long userRoleId) throws Exception;
}
