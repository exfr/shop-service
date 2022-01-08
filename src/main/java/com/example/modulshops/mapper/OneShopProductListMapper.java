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
public class OneShopProductListMapper implements RowMapper<Shop> {

    @Override
    public Shop mapRow(ResultSet rs, int rowNum) throws SQLException {

        Shop oneShop = new Shop();
        oneShop.setId(rs.getInt("idShop"));
        oneShop.setShop_name(rs.getString("shopName"));

        List<Shop.Product> productList = new ArrayList<>();
        while (rs.next()) {
            Shop.Product product = new Shop.Product();
            product.setProduct_name(rs.getString("productName"));
            product.setId(rs.getInt("idProduct"));
            product.setCount(rs.getInt("count"));
            productList.add(product);
        }
        
        System.out.println("productList: " + productList);

        oneShop.setProductList(productList);

        System.out.println("oneShop: " + oneShop);
        
        return oneShop;
    }
}
