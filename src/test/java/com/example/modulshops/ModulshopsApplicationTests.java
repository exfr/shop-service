package com.example.modulshops;

import com.example.modulshops.mapper.ShopMapper;
import com.example.modulshops.model.Shop;
import lombok.AllArgsConstructor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@AllArgsConstructor
class ModulshopsApplicationTests {

	private final JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
	}

//	@Test
//	public List<Shop> getShopListAll() {
//
//		String query = "SELECT shop.id AS idShop, shop.shop_name AS shopName FROM shop";
//
//		//Optional<Shop> shopList = Optional.of(jdbcTemplate.query(query, new ShopMapper()));
//		List<Shop> shoplist = null;
//		shoplist = Optional.of(jdbcTemplate.query(query, new ShopMapper())).orElseThrow();
//		List<Shop> shopListAssertion = jdbcTemplate.query(query, new ShopMapper());
//		Assert.assertEquals("ghvj", shoplist, shopListAssertion);
//
//
//		return shoplist;
//	}




}
