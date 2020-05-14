package com.jkt.techbyte.menu.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MenuRepository implements IMenuRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public List<RepositoryMenuModel> findByUserRoleId(long userRoleId) throws Exception {
        if (userRoleId == 0) {
            return jdbcTemplate.query("select * from ad_menu", new MenuMapper());
        } else {
            String sqlQuery = "select adm.id,adm.name,adm.parent_id,admu.role_id from public.ad_menu adm " +
                    "inner join ad_menu_role admu  on adm.id=admu.menu_id where admu.role_id = :userRoleId ";
            return jdbcTemplate.query(sqlQuery, Map.of("userRoleId", userRoleId), new MenuMapper());
        }
    }
}
