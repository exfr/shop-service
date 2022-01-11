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

}
