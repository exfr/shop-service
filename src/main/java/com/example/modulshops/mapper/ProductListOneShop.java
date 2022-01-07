///**
// * @author Vasilshift
// */
//package com.example.modulshops.mapper;
//
//import com.example.modulshops.model.rest.Shop;
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ProductListOneShop implements RowMapper<List<Shop.Product>> {
//    @Override
//    public List<Shop.Product> mapRow(ResultSet rs, int rowNum) throws SQLException {
//        List<Shop.Product> productListOneShop = new ArrayList<>();
//        while (rs.next()) {
//            Shop shop = new Shop();
//            shop.setId(rs.getLong("id"));
//            shop.setShop_name(rs.getString("shop_name"));
//            //shop.setProductList(rs.getObject("pdoductList", ProductListMapper));
//            shopList.add(shop);
//        }
//
//
//        return productListOneShop;
//    }
//}
