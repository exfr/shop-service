package com.example.modulshops.repository;

import com.example.modulshops.mapper.ShopMapper;
import com.example.modulshops.model.rest.Shop;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class ShopRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Shop> getShopListAll() {
        List<Shop> shopList = jdbcTemplate.queryForObject(
                "SELECT * FROM shop", new ShopMapper());

        return shopList;
    }






//    @Override
//    Optional<Shop> findById(Long aLong);
//
//    @Override
//    List<Shop> findAll();

}
