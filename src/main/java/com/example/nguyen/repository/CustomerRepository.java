/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.nguyen.repository;

import com.example.nguyen.entities.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author XV
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    
}
