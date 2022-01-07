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

    private List<Shop.Product> productList;

    @Autowired
    public ShopService(List<Shop.Product> productList) {
        this.productList = productList;
    }

    public List<Shop> getShopListAll() {
        List<Shop> shopList = jdbcTemplate.queryForObject(
                "SELECT * FROM shop", new ShopsMapper());
        return shopList;
    }

    public Shop getOneShop(long id) {
       String query = "SELECT * FROM shop" +
               "WHERE id = 3" ;
       Shop shop = jdbcTemplate
               .queryForObject(query, new OneShopMapper());
        return shop;
    }

    public List<Shop.Product> getProductList(){
        List<Shop.Product> list = jdbcTemplate.queryForObject("SELECT * FROM product", new ProductListMapper());
        return list;
    }


}
