package com.example.modulshops.service;

import com.example.modulshops.mapper.OneShopMapper;
import com.example.modulshops.mapper.ProductListMapper;
import com.example.modulshops.mapper.ShopsMapper;
import com.example.modulshops.model.rest.Shop;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
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
       Shop shop = jdbcTemplate
               .queryForObject("SELECT * FROM shop WHERE id =" + id, new OneShopMapper(productList));
        return shop;
    }

    public List<Shop.Product> getProductList(){
        List<Shop.Product> list = jdbcTemplate.queryForObject("SELECT * FROM product", new ProductListMapper());
        return list;
    }


}
