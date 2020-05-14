package com.jkt.techbyte.menu.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MenuRepository implements IMenuRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<RepositoryMenuModel> getAllMenus(int userRoleId) throws Exception {
		if(userRoleId == 0){
			return jdbcTemplate.query("select * from ad_menu", new MenuMapper());
		}else{
			String sqlQuery="select adm.id,adm.name,adm.parent_id,admu.role_id from public.ad_menu adm " +
					"inner join ad_menu_role admu  on adm.id=admu.menu_id where admu.role_id = "+userRoleId+"";
			return jdbcTemplate.query(sqlQuery, new MenuMapper());
		}
	}

}
