/**
 * @author Vasilshift
 */
package com.example.modulshops.repository;

import com.example.modulshops.exception.MySQLException;
import com.example.modulshops.mapper.OneShopProductListMapper;
import com.example.modulshops.mapper.ProductListMapper;
import com.example.modulshops.mapper.ShopMapper;
import com.example.modulshops.model.Shop;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class MainRepository {

    private final JdbcTemplate jdbcTemplate;

    public List<Shop> getShopListAll() {
        String query = "SELECT shop.id AS idShop, shop.shop_name AS shopName FROM shop";
        List<Shop> shoplist = null;
        try {
            shoplist = jdbcTemplate.query(query, new ShopMapper());
        } catch (MySQLException e) {
            e.printStackTrace();
        }
        return shoplist;
    }

    public Optional<Shop> getOneShopListProducts(int id) throws MySQLException {
        String query = null;
        //Optional<Shop> shop = null;

        query = "SELECT shop.id AS idShop, shop.shop_name AS shopName, product.id AS idProduct, product.product_name AS productName, " +
                "product.count AS count FROM shop inner join product ON shop.id = product.id_shop WHERE shop.id = ?";

//        Optional<Shop> shop = Optional.of(jdbcTemplate.query(query, new OneShopProductListMapper(), id))
//                .get().stream().findAny()
//                .orElseThrow(() -> new MySQLException("file not found"));

        Optional<Shop> shop = Optional.of(jdbcTemplate.query(query, new OneShopProductListMapper(), id))
                .get().stream().findAny();



        return shop;
    }

    public List<Shop.Product> getProductList(){
        String query = "SELECT product.id AS idProduct, product.product_name AS productName, product.count AS count FROM product";
        List<Shop.Product> list = jdbcTemplate.query(query, new ProductListMapper());
        return list;
    }
}
