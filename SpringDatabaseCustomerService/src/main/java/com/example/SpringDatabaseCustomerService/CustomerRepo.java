package com.example.SpringDatabaseCustomerService;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
