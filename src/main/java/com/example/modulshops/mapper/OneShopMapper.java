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
public class OneShopMapper implements RowMapper<Shop> {

    @Override
    public Shop mapRow(ResultSet rs, int rowNum) throws SQLException {

        Shop oneShop = new Shop();
        oneShop.setId(rs.getInt("id"));
        oneShop.setShop_name(rs.getString("shopName"));

        List<Shop.Product> productList = new ArrayList<>();

        while(rs.next()) {
            Shop.Product product = new Shop.Product();
            product.setProduct_name(rs.getString("productName"));
            product.setId(rs.getInt("id_of_product"));
            product.setCount(rs.getInt("count"));
            productList.add(product);
        }

        oneShop.setProductList(productList);

        return oneShop;
    }
}
