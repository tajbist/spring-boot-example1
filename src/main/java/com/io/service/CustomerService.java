package com.io.service;

import com.io.domain.Customer;
import com.io.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void  delete(Integer custId) {
         customerRepository.deleteById(custId);
    }

    public Customer saveOrUpdate(Customer customer) {
        return customerRepository.save(customer);
    }


    public Optional<Customer> getCustomer(Integer custId) {
        return customerRepository.findById(custId);
    }
}
