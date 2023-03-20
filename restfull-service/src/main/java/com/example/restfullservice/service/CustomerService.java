/**
 * 
 */
package com.example.restfullservice.service;

import java.util.List;

/**
 * @author Nurullah Polat
 *
 */

import org.springframework.stereotype.Service;

import com.example.restfullservice.model.Customer;

@Service
public interface CustomerService {
	
	public void saveCustomer(Customer customer);
	
	public List<Customer> getAllCustomer();

}
