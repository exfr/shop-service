/**
 * @author Vasilshift
 */
package com.example.modulshops.mapper;

import com.example.modulshops.model.rest.Shop;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ShopMapper extends BeanPropertyRowMapper<Shop> {

    @Override
    public Shop mapRow(ResultSet rs, int rowNum) throws SQLException {
            Shop shop = new Shop();
            shop.setId(rs.getInt("id"));
            shop.setShop_name(rs.getString("shop_name"));

        return shop;
    }
}
