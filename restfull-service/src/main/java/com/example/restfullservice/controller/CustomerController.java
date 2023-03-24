package com.example.restfullservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<?> getAllCustomer(){
		
		try {			
			return new ResponseEntity<>(customerServiceImpl.getAllCustomer(), HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<>("Error ocurred : "+ e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Customer customer) {
		
		try {
			customerServiceImpl.saveCustomer(customer);
			return new ResponseEntity<>(customerServiceImpl.getAllCustomer(), HttpStatus.CREATED);
		} catch (Exception e){
			return new ResponseEntity<>("Error ocurred : "+ e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}

}
