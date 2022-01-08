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
public class ProductListMapper implements RowMapper<Shop.Product> {

    @Override
    public Shop.Product mapRow(ResultSet rs, int rowNum) throws SQLException {

        //List<Shop.Product> productList = new ArrayList<>();

            Shop.Product product = new Shop.Product();
            product.setId(rs.getInt("idProduct"));
            product.setProduct_name(rs.getString("productName"));
            product.setCount(rs.getInt("count"));
            //productList.add(product);


        return product;
    }

}
