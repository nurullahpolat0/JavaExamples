package com.example.springbootlog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springbootlog4j.controller.Log4jExampleController;

@SpringBootApplication
public class SpringBootLog4jApplication {

	private static final Logger logger = LogManager.getLogger(SpringBootLog4jApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootLog4jApplication.class, args);
		logger.info("Log4j Example Application started.");
	}

}
