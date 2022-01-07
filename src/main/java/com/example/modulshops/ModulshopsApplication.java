package com.example.modulshops;

import com.example.modulshops.model.rest.Shop;
//import com.example.modulshops.service.ShopJDBCTemplate;
import com.example.modulshops.util.DBWorker;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class ModulshopsApplication {

	public static void main(String[] args) throws SQLException {

		SpringApplication.run(ModulshopsApplication.class, args);

		//ApplicationContext context = new AnnotationConfigApplicationContext("com.example.modulshops");
		//ShopJDBCTemplate shopJDBCTemplate = (ShopJDBCTemplate) context.getBean("shopJDBCTemplate");

		//Shop shop = shopJDBCTemplate.getShop(1);
		//System.out.println("Id : " + shop.getId());

//		DBWorker dbWorker = new DBWorker();
//		String query = "select * from shop";
//
//		try {
//
//			Statement statement =
//			ResultSet resultSet = statement.executeQuery(query);
//
//			while (resultSet.next()) {
//				Shop shop = new Shop();
//				long id = resultSet.getLong(1);
//				System.out.println(shop);
//			}
//
//		} catch (SQLException throwables) {
//			throwables.printStackTrace();
//		}


	}
	
	
	


}
