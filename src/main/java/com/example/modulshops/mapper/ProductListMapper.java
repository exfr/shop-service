/**
 * @author Vasilshift
 */
package com.example.modulshops.mapper;

import com.example.modulshops.model.Shop;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProductListMapper implements RowMapper<Shop.Product> {

    @Override
    public Shop.Product mapRow(ResultSet rs, int rowNum) throws SQLException {

            Shop.Product product = new Shop.Product();
            product.setId(rs.getInt("idProduct"));
            product.setProduct_name(rs.getString("productName"));
            product.setCount(rs.getInt("count"));

        return product;
    }
}
