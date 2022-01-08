package com.example.modulshops.service;

import com.example.modulshops.mapper.OneShopProductListMapper;
import com.example.modulshops.mapper.ProductListMapper;
import com.example.modulshops.mapper.ShopMapper;
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

    @Autowired
    private OneShopProductListMapper oneShopProductListMapper;

    public List<Shop> getShopListAll() {
        List<Shop> shopList = jdbcTemplate.query(
                "SELECT * FROM shop", new ShopMapper());
        return shopList;
    }

    public Shop getOneShopListProducts(int id) {
        String query = "SELECT shop.id AS idShop, shop.shop_name AS shopName FROM shop WHERE shop.id = " + id;
//        String query = "SELECT shop.id AS idShop,"  +
//                "shop.shop_name AS shopName, " +
//                "product.id AS idProduct, product.product_name AS productName, " +
//                "product.count AS count FROM shop inner join product ON shop.id = product.id_shop WHERE shop.id = " + id;

       //List<Shop.Product> productList = getProductListOneShop(id);
       //System.out.println("productList FROM getOneShopListProducts: " + productList);
       Shop shop = jdbcTemplate.queryForObject(query, new OneShopProductListMapper());
       //System.out.println(shop);
        return shop;
    }


    public List<Shop.Product> getProductListOneShop(int id) {
        //String query = "SELECT * FROM shop WHERE shop.id = " + id;
        String query = "SELECT " +
                "product.id AS idProduct, product.product_name AS productName, " +
                "product.count AS count FROM shop inner join product ON shop.id = product.id_shop WHERE shop.id = " + id;

        List<Shop.Product> productListOneShop = jdbcTemplate.query(query, new ProductListMapper());
        System.out.println("productListOneShop: " + productListOneShop);
        return productListOneShop;
    }



        public List<Shop.Product> getProductList(){
        String query = "SELECT product.id AS idProduct, product.product_name AS productName, product.count AS count FROM product";
        List<Shop.Product> list = jdbcTemplate.query(query, new ProductListMapper());
        return list;
    }


}
