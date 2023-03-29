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

import com.example.restfullservice.dto.CustomerDto;

@Service
public interface CustomerService {
	
	public void saveCustomer(CustomerDto customerDto);
	
	public List<CustomerDto> getAllCustomer();
	
    public void deleteCustomerById(int id);

}
