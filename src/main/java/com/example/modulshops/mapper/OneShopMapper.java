/**
 * @author Vasilshift
 */
package com.example.modulshops.mapper;

import com.example.modulshops.model.rest.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class OneShopMapper implements RowMapper<Shop> {

    @Override
    public Shop mapRow(ResultSet rs, int rowNum) throws SQLException {

        Shop oneShop = new Shop();
        oneShop.setId(rs.getLong("id"));
        oneShop.setShop_name(rs.getString("shop_name"));

        return oneShop;
    }
}
