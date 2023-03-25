/**
 * 
 */
package com.example.restfullservice.service;

import java.util.List;

/**
 * @author Nurullah Polat
 *
 *This is a interface class for CustomerService class
 *
 */

import org.springframework.stereotype.Service;

import com.example.restfullservice.model.Customer;

@Service
public interface CustomerService {
	
	public void saveCustomer(Customer customer);
	
	public List<Customer> getAllCustomer();
	
    public void deleteCustomerById(int id);

}
