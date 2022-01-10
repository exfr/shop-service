/**
 * @author Vasilshift
 */
package com.example.modulshops.repository;

import com.example.modulshops.exception.BusinessException;
import com.example.modulshops.exception.MySQLException;
import com.example.modulshops.mapper.OneShopProductListMapper;
import com.example.modulshops.mapper.ProductListMapper;
import com.example.modulshops.mapper.ShopMapper;
import com.example.modulshops.model.Shop;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.UncheckedIOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class MainRepository {

    private final JdbcTemplate jdbcTemplate;



    public List<Shop> getShopListAll() {

        String query = "SELECT shop.id AS idShop, shop.shop_name AS shopName FROM lshop";

        //Optional<Shop> shopList = Optional.of(jdbcTemplate.query(query, new ShopMapper()));

        List<Shop> shoplist = jdbcTemplate.query(query, new ShopMapper());


        return shoplist;
    }

    public List<Shop> getOneShopListProducts(int id) {
        String query = "SELECT shop.id AS idShop, shop.shop_name AS shopName, product.id AS idProduct, product.product_name AS productName, " +
                "product.count AS count FROM shop inner join product ON shop.id = product.id_shop WHERE shop.id = ?";
        List<Shop> shop = jdbcTemplate.query(query, new OneShopProductListMapper(), id);
        return shop;
    }

    public List<Shop.Product> getProductList(){
        String query = "SELECT product.id AS idProduct, product.product_name AS productName, product.count AS count FROM product";
        List<Shop.Product> list = jdbcTemplate.query(query, new ProductListMapper());
        return list;
    }
}
