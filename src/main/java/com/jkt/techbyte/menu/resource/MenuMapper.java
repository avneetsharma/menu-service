package com.jkt.techbyte.menu.resource;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuMapper implements RowMapper<RepositoryMenuModel>{
	RepositoryMenuModel menuModel ;
	@Override
	public RepositoryMenuModel mapRow(ResultSet rs, int id) throws SQLException {
		menuModel = new RepositoryMenuModel();
		menuModel.setMenuId(rs.getLong("id"));
		menuModel.setMenuName(rs.getString("name"));
		menuModel.setMenuParentId(rs.getLong("parent_id"));
		return menuModel;
	}

}
