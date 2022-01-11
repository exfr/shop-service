package com.example.modulshops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.sql.SQLException;


@SpringBootApplication
public class ModulshopsApplication {

	//private static Logger logger = LoggerFactory.getLogger(ModulshopsApplication.class.getName());

	public static void main(String[] args) {

		//System.out.println(getClass().getClassLoader().getResource("logging.properties"));


		System.out.println(ModulshopsApplication.class.getClassLoader().getResource("logging.properties"));


		SpringApplication.run(ModulshopsApplication.class, args);
		//logger.info(ModulshopsApplication.class.getName());





	}

}
