package com.example.modulshops.service;

import com.example.modulshops.model.Shop;
import com.example.modulshops.repository.MainRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.FileHandler;
import java.util.logging.Handler;

@Service
@AllArgsConstructor
public class MainService {

    private final MainRepository mainRepository;

    private static Logger logger = LoggerFactory.getLogger(MainService.class.getName());


    //@SneakyThrows
    public List<Shop> getShopListAll() {
        return mainRepository.getShopListAll();
    }

    public Optional<Shop> getOneShopListProducts(int id) throws Exception {
        logger.info("logger method getOneShopListProducts");
        //Handler fileHandler = new FileHandler("ExceptionsLog", true);

        return mainRepository.getOneShopListProducts(id);
    }

    public List<Shop.Product> getProductList() {
        return mainRepository.getProductList();
    }

}
