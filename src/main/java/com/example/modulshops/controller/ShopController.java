/**
 * @author Vasilshift
 */
package com.example.modulshops.controller;

import com.example.modulshops.mapper.ShopMapper;
import com.example.modulshops.model.rest.Shop;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ShopController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //private ShopRepository shopRepository;

    @GetMapping("/shops")
    public List<Shop> getShopList() throws Exception {

        List<Shop> shopList = jdbcTemplate.queryForObject(
                "SELECT * FROM shop", new ShopMapper());
        System.out.println(shopList);
//        List<Shop> shopList = Optional.ofNullable(shopRepository.findAll()).orElse(null);
//        if (shopList != null) {
//            return new ResponseEntity<>(shopList, HttpStatus.FOUND);
//        } else {
//            throw new BusinessException("Shops not found");
//        }
        return shopList;
    }

    @GetMapping("/goods/{id}")
    public void getGoodsList(@PathVariable("id") long id) {

    }

    @GetMapping("/redirect/{userId}")
    public void redirect(@PathVariable("userId") long userId) {
    }

    @GetMapping("/info/{userId}")
    public void getShopsInfo(@PathVariable("userId") long userId) {
    }

    @PostMapping("/fill")
    public void fillShopsGoods(@RequestBody List<Shop> shopsList) {
    }

    public ShopController() {
    }

}
