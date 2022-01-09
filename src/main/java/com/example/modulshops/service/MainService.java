package com.example.modulshops.service;

import com.example.modulshops.model.Shop;
import com.example.modulshops.repository.MainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MainService {

    private final MainRepository mainRepository;

    public List<Shop> getShopListAll() {
        return mainRepository.getShopListAllRepo();
    }

    public List<Shop> getOneShopListProducts(int id) {
        return mainRepository.getOneShopListProductsRepo(id);
    }

    public List<Shop.Product> getProductList() {
        return mainRepository.getProductListRepo();
    }

}
