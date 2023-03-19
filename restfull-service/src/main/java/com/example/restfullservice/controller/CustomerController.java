package com.example.restfullservice.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfullservice.model.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	Customer customer;
	
	@GetMapping("/users")
	public List <Customer> getAllCustomer(){
		
		customer = new Customer(1,"nurullah",17);
		List<Customer> customerList = new LinkedList<Customer>();
		customerList.add(customer);
		return customerList;
	}

}
