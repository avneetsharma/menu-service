package com.jkt.techbyte.menu.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService implements IMenuService {
	
	@Autowired
	private IMenuRepository imenuRepository;

	@Override
	public UserResponce findByUserRoleId(long userRoleId) throws Exception {
		List<RepositoryMenuModel> listMenuModel = imenuRepository.findByUserRoleId(userRoleId);
		return MenuUtils.prepareUserMenu(listMenuModel);
	}

}
