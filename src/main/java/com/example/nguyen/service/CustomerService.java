/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.nguyen.service;

import com.example.nguyen.entities.Customer;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.nguyen.repository.CustomerRepository;

/**
 *
 * @author XV
 */
@Service
public class CustomerService implements CustomerServiceIF{

    @Autowired
    CustomerRepository customerRepositoryIF; 
    
    @Override
    public List<Customer> getCustomers() {
	return (List)customerRepositoryIF.findAll();
    }

    @Override
    public void saveCustomer(Customer theCustomer) {
        customerRepositoryIF.save(theCustomer);
    }

    @Override
    public Customer getCustomer(int theId) {
	Optional<Customer> customerOpt = customerRepositoryIF.findById(theId);
	return customerOpt.isPresent() ? customerOpt.get() : null;
    }

    @Override
    public void deleteCustomer(int theId) {
	customerRepositoryIF.deleteById(theId);
    }
    
}
