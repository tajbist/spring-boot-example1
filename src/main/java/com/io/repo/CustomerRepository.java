package com.io.repo;

import com.io.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
