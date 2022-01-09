///**
// * @author Vasilshift
// */
//package com.example.modulshops.client;
//
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpMethod;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//@AllArgsConstructor
//@Component
//public class PurchaseClient {
//
//    //todo: check lombok
//    private final ClientConfig config;
//
//    public void redirectToPurchase(long userId) {
//        String url = String.format("http://host:port/purchase?userId=%s", userId);
//        RestTemplate restTemplate = new RestTemplate();
//        HttpEntity<Object> entity = new HttpEntity("");
//        restTemplate.exchange(url, HttpMethod.GET, entity, String.class, new Object[0]);
//    }
//
//
//
//}
