package com.example.modulshops.service;

import com.example.modulshops.mapper.OneShopMapper;
import com.example.modulshops.mapper.ProductListMapper;
import com.example.modulshops.mapper.ShopsMapper;
import com.example.modulshops.model.rest.Shop;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShopService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Shop> getShopListAll() {
        List<Shop> shopList = jdbcTemplate.query(
                "SELECT * FROM shop", new ShopsMapper());
        return shopList;
    }

    public Shop.Product getOneShop(int id) {
        String query = "SELECT * FROM shop WHERE shop.id = " + id;
        //String query = "SELECT " + id + " AS id,"  +
//                "shop.shop_name AS shopName, " +
//                "product.id AS id_of_product, product.product_name AS productName, " +
//                "product.count AS count FROM shop inner join product ON shop.id = product.id_shop WHERE shop.id = " + id;

       //List<Shop.Product> productList = shopService.getProductList();
       // List<Shop.Product> query1 =

       Shop.Product shop = jdbcTemplate.query(query, new OneShopMapper());
       System.out.println(shop);
        return shop;
    }

    public List<Shop.Product> getProductList(){
        List<Shop.Product> list = jdbcTemplate.query("SELECT * FROM product", new ProductListMapper());
        return list;
    }


}
