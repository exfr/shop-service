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

@Component
public class ShopsMapper implements RowMapper<List<Shop>> {
    @Override
    public List<Shop> mapRow(ResultSet rs, int rowNum) throws SQLException {
        List<Shop> shopList = new ArrayList<>();

        while (rs.next()) {
            Shop shop = new Shop();
            shop.setId(rs.getLong("id"));
            shop.setShopName(rs.getString("shopName"));
            shopList.add(shop);
        }
        return shopList;
    }
}
