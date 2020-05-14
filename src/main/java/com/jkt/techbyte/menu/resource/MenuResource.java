package com.jkt.techbyte.menu.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/menu")
public class MenuResource {
	@Autowired
	private IMenuService imenuService;

	@GetMapping
	public ResponseEntity<UserResponce> getAllUserMenu() throws Exception {
		UserResponce userMenu = imenuService.getAllMenus(0);
		return ResponseEntity.status(HttpStatus.CREATED).body(userMenu);

	}

	@GetMapping("/{userRoleId}")
	public ResponseEntity<UserResponce> getUserAssignedMenu(@PathVariable int userRoleId) throws Exception {
		UserResponce userMenu = imenuService.getAllMenus(userRoleId);
		return ResponseEntity.status(HttpStatus.CREATED).body(userMenu);

	}

}
