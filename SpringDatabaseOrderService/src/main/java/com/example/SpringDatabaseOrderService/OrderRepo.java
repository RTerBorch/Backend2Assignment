package com.example.SpringDatabaseOrderService;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<CustomerOrder, Long> {
}
