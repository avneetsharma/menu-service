package com.jkt.techbyte.menu.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/menu")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MenuResource {
    @Autowired
    private IMenuService imenuService;

    @GetMapping
    public ResponseEntity<UserResponce> getAllUserMenu() throws Exception {
        UserResponce userMenu = imenuService.findByUserRoleId(0);
        return ResponseEntity.status(HttpStatus.CREATED).body(userMenu);

    }

    @GetMapping("/{userRoleId}")
    public ResponseEntity<UserResponce> getMenuByUserRoleId(@PathVariable long userRoleId) throws Exception {
        UserResponce userMenu = imenuService.findByUserRoleId(userRoleId);
        return ResponseEntity.status(HttpStatus.CREATED).body(userMenu);

    }

}
