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
import java.util.stream.Collectors;

@Component
public class OneShopMapper implements RowMapper<Shop.Product> {

    @Override
    public Shop.Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        Shop oneShop = new Shop();
        oneShop.setId(rs.getInt("id"));
        oneShop.setShop_name(rs.getString("shop_name"));

        List<Shop.Product> productList = new ArrayList<>();

        while(rs.next()) {
            Shop.Product product = new Shop.Product();
            product.setProduct_name(rs.getString("product_name"));
            product.setId(rs.getInt("id"));
            product.setCount(rs.getInt("count"));
            productList.add(product);
        }
        System.out.println("productList: " + productList);
        oneShop.setProductList(productList);

        return null;
    }
}
