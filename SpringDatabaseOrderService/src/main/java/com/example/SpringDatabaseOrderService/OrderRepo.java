package com.example.SpringDatabaseOrderService;

import com.example.SpringDatabaseOrderService.Models.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<CustomerOrder, Long> {
}
