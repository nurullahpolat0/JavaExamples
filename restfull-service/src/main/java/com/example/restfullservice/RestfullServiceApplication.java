package com.example.restfullservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestfullServiceApplication {
	
	/**
	 * We are using modelmapper for converting dto class to model class and vice versa.
	 * We have configured ModelMapper as Spring bean.
	 * @return
	 */
	@Bean
	public ModelMapper modelMapper(){
		
		return new ModelMapper();
		
	}

	public static void main(String[] args) {
		
		SpringApplication.run(RestfullServiceApplication.class, args);
	}

}
