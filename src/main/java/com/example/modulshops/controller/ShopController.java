/**
 * @author Vasilshift
 */
package com.example.modulshops.controller;

import com.example.modulshops.model.rest.Shop;
import com.example.modulshops.service.ShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Api("test swagger")
public class ShopController {

    @Autowired
    private final ShopService shopService;

    @GetMapping("/shops")
    @ApiOperation("get shop list")
    public List<Shop> getShopList() throws Exception {
        System.out.println("Getting all shops ... ");
        return shopService.getShopListAll();

        //System.out.println(shopList);
//        List<Shop> shopList = Optional.ofNullable(shopRepository.findAll()).orElse(null);
//        if (shopList != null) {
//            return new ResponseEntity<>(shopList, HttpStatus.FOUND);
//        } else {
//            throw new BusinessException("Shops not found");
//        }

    }


    @GetMapping("/shops/{id}")
    @ApiOperation("get one shop")
    public Shop getOneShop(@PathVariable("id")long id) {
        System.out.println("Get One Shop ... ");
        return shopService.getOneShop(id);
    }

//    @GetMapping("/goods")
//    public List<Shop.Product> getGoodsListAll() {
//        return shopService.getProductList();
//    }
//
//    @GetMapping("/redirect/{userId}")
//    public void redirect(@PathVariable("userId") long userId) {
//    }
//
//    @GetMapping("/info/{userId}")
//    public void getShopsInfo(@PathVariable("userId") long userId) {
//    }
//
//    @PostMapping("/fill")
//    public void fillShopsGoods(@RequestBody List<Shop> shopsList) {
//    }

}
