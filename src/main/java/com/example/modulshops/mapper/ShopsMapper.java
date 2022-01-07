/**
 * @author Vasilshift
 */
package com.example.modulshops.mapper;

import com.example.modulshops.model.rest.Shop;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ShopsMapper implements RowMapper<List<Shop>> {
    private Object ProductListMapper;

    @Override
    public List<Shop> mapRow(ResultSet rs, int rowNum) throws SQLException {
        List<Shop> shopList = new ArrayList<>();

        while (rs.next()) {
            Shop shop = new Shop();
            shop.setId(rs.getInt("id"));
            shop.setShop_name(rs.getString("shop_name"));
            //shop.setProductList(rs.getObject("pdoductList", ProductListMapper));
            shopList.add(shop);
        }
        return shopList;
    }
}
