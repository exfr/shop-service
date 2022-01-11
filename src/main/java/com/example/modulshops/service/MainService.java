package com.example.modulshops.service;

import com.example.modulshops.model.Shop;
import com.example.modulshops.repository.MainRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MainService {

    private final MainRepository mainRepository;

    //@SneakyThrows
    public List<Shop> getShopListAll() {
        return mainRepository.getShopListAll();
    }

    public Optional<Shop> getOneShopListProducts(int id) throws Exception {
        return mainRepository.getOneShopListProducts(id);
    }

    public List<Shop.Product> getProductList() {
        return mainRepository.getProductList();
    }

}
