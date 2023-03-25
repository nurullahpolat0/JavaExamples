package com.example.restfullservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restfullservice.model.Customer;
import com.example.restfullservice.service.CustomerServiceImpl;

/**
 * @author Nurullah Polat
 *
 */
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	/**
	 * This is a constructor injection usage. 
	 * It is recommended usage by most programmers.
	 */
	private final CustomerServiceImpl customerServiceImpl;
	
	public CustomerController(CustomerServiceImpl customerServiceImpl) {
		this.customerServiceImpl = customerServiceImpl;
	}
	
	
	/**
	 * The @GetMapping annotation is a composed version of @RequestMapping annotation that acts as a shortcut 
	 * for @RequestMapping(method = RequestMethod. GET). The @GetMapping annotated methods handle the HTTP GET 
	 * requests matched with the given URI expression.
	 * 
	 * ResponseEntity represents the whole HTTP response: status code, headers, and body. 
	 * As a result, we can use it to fully configure the HTTP response. If we want to use it, 
	 * we have to return it from the endpoint; Spring takes care of the rest.
	 * 
	 * This method receives all customer data from database by calling service class.
	 */
	@GetMapping("/customers")
	public ResponseEntity<?> getAllCustomer(){
		
		try {			
			return new ResponseEntity<>(customerServiceImpl.getAllCustomer(), HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<>("Error ocurred : "+ e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	/**
	 * The @PostMapping is a specialized version of @RequestMapping annotation that acts as a shortcut 
	 * for @RequestMapping(method = RequestMethod. POST). The @PostMapping annotated methods handle the HTTP POST 
	 * requests matched with the given URI expression.
	 * 
	 * @param customer
	 * @return
	 * 
	 * This method calls service class in order to save customer data to database.
	 */	
	@PostMapping("/save")
	public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) {
		
		try {
			customerServiceImpl.saveCustomer(customer);
			return new ResponseEntity<>("Data is saved", HttpStatus.CREATED);
		} catch (Exception e){
			return new ResponseEntity<>("Error ocurred : "+ e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * 
	 * @DeleteMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. DELETE).
	 * 
	 * This method deletes customer data by using id.
	 */
	
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<?> deleteCustomerById(@PathVariable int id){
		
		try {
			customerServiceImpl.deleteCustomerById(id);
			return new ResponseEntity<>("Data is deleted", HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<>("Error ocurred : "+ e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
