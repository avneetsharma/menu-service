package com.jkt.techbyte.menu.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService implements IMenuService {
	
	@Autowired
	private IMenuRepository imenuRepository;

	@Override
	public UserResponce getAllMenus(int userRoleId) throws Exception {
		List<RepositoryMenuModel> listMenuModel = imenuRepository.getAllMenus(userRoleId);
		return MenuUtils.prepareUserMenus(listMenuModel);
	}

}
