package com.example.modulshops.controller;

import com.example.modulshops.exception.BusinessException;
import com.example.modulshops.model.rest.Shop;
import com.example.modulshops.service.MainService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

    private final MainService mainService;

    @Operation(summary = "Get all shops",
            responses = {
                    @ApiResponse(description = "Successful Operation",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Shop.class)))
                    //@ApiResponse(responseCode = "404", description = "Not found", content = @Content),
                    //@ApiResponse(responseCode = "401", description = "Authentication Failure", content = @Content(schema = @Schema(hidden = false)))
            })
    @GetMapping("/shops")
    public ResponseEntity<List<Shop>> getShopList() {
        //todo: exception
        List<Shop> shopList = mainService.getShopListAll();

        //System.out.println(shopList);
        //List<Shop> shopList = Optional.ofNullable(shopRepository.findAll()).orElse(null);

        if (shopList != null) {
            return new ResponseEntity<>(shopList, HttpStatus.FOUND);
        } else {
            throw new BusinessException("Shops not found");
            //todo: how exception return

        }
        //return shopList;
    }

    //todo: exception handler
    @Operation(summary = "Get shop to id with products",
            responses = {
                    @ApiResponse(description = "Successful Operation",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Shop.class)))
                    //@ApiResponse(responseCode = "404", description = "Not found", content = @Content),
                    //@ApiResponse(responseCode = "401", description = "Authentication Failure", content = @Content(schema = @Schema(hidden = true)))
            })
    @GetMapping("/shops/{id}")
    public List<Shop> getOneShopWithProduct(@PathVariable("id")int id) {
        System.out.println("Get One Shop ... ");
        return mainService.getOneShopListProducts(id);
    }

    //todo: exception handler
    @Operation(summary = "Get shop to id with products",
            responses = {
                    @ApiResponse(description = "Successful Operation",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Shop.class))),
                    @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Authentication Failure", content = @Content(schema = @Schema(hidden = true)))
            })
    @GetMapping("/shops/products/{id}")
    public List<Shop.Product> getProductsOneShop(@PathVariable("id")int id) {




        return mainService.getProductListOneShop(id);

    }

    //todo: exception handler
    @GetMapping("/allproducts")
    public List<Shop.Product> getGoodsListAll() {
        return mainService.getProductList();
    }
//todo: Do it
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
