package com.jkt.techbyte.menu.resource;

public interface IMenuService {
    UserResponce findByUserRoleId(long userRoleId) throws Exception;
}
