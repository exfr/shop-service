///**
// * @author Vasilshift
// */
//package com.example.modulshops.service;
//
//import com.example.modulshops.model.rest.Shop;
//import com.example.modulshops.repository.ShopRepository;
//import com.example.modulshops.util.RandomInserting;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@AllArgsConstructor
//public class MyService {
//    private final ShopRepository shopRepository;
//    private final RandomInserting inserting;
//
//    public List<Shop> getShops() {
//        List<Shop> shopList = shopRepository.findAll();
//        //List<Object> shopListRandom = RandomInserting.random(shopList);
//        //System.out.println("shopList: " + shopListRandom);
//
//        return shopList;
//    }
//}
