package com.example.restfullservice.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfullservice.model.Customer;
import com.example.restfullservice.service.CustomerServiceImpl;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerServiceImpl customerServiceImpl;
	
	@GetMapping("/customers")
	public List <Customer> getAllCustomer(){
		
		return customerServiceImpl.getAllCustomer();
	}

}
