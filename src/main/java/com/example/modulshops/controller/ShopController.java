/**
 * @author Vasilshift
 */
package com.example.modulshops.controller;

import com.example.modulshops.mapper.ShopMapper;
import com.example.modulshops.model.rest.Shop;
import com.example.modulshops.repository.ShopRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ShopController {

    @Autowired
    private ShopRepository shopRepository;

    @GetMapping("/shops")
    public List<Shop> getShopList() throws Exception {
        System.out.println("Getting all shops ... ");
        return shopRepository.getShopListAll();
        
        //System.out.println(shopList);
//        List<Shop> shopList = Optional.ofNullable(shopRepository.findAll()).orElse(null);
//        if (shopList != null) {
//            return new ResponseEntity<>(shopList, HttpStatus.FOUND);
//        } else {
//            throw new BusinessException("Shops not found");
//        }

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
