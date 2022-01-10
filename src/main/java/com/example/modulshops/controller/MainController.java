package com.example.modulshops.controller;

import com.example.modulshops.model.Shop;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class MainController {

    private final MainService mainService;

    @Operation(summary = "Get all shops",
            responses = {
                    @ApiResponse(description = "Successful Operation",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Shop.class))),
                    @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Authentication Failure", content = @Content(schema = @Schema(hidden = true)))})
    @GetMapping("/shops")
    public ResponseEntity<List<Shop>> getShopList() {
        List<Shop> shopList = mainService.getShopListAll();
        if (shopList == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(shopList, HttpStatus.OK);
    }

    //todo: exception handler
    @Operation(summary = "Get shop to id with products",
            responses = {
                    @ApiResponse(description = "Successful Operation",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Shop.class))),
                    @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Authentication Failure")})
    @GetMapping("/shops/{id}")
    public ResponseEntity<List<Shop>> getOneShopWithProduct(@PathVariable("id")int id) {
        List<Shop> shopList = mainService.getOneShopListProducts(id);
        if (shopList == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(shopList, HttpStatus.OK);
    }


    //todo: exception handler
    @Operation(summary = "Get all products",
            responses = {
                    @ApiResponse(description = "Successful Operation",
                            responseCode = "200",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = Shop.class))),
                    @ApiResponse(responseCode = "404", description = "Not found", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Authentication Failure", content = @Content(schema = @Schema(hidden = true)))})
    @GetMapping("/allproducts")
    public ResponseEntity<List<Shop.Product>> getGoodsListAll() {
        List<Shop.Product> productList = mainService.getProductList();
        if (productList == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
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
