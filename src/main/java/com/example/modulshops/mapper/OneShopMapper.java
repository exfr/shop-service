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

    private List<Shop.Product> productList;

    @Autowired
    public OneShopMapper(List<Shop.Product> productList) {
        this.productList = productList;
    }



    @Override
    public Shop mapRow(ResultSet rs, int rowNum) throws SQLException {

        Shop oneShop = new Shop();
        oneShop.setId(rs.getLong("id"));
        oneShop.setShopName(rs.getString("shopName"));
        oneShop.setProductList(productList);

        return oneShop;
    }
}
