package com.example.SpringDatabaseOrderService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Controller
public class OrderController {


    private final OrderRepo orderRepo;

    public OrderController(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @RequestMapping("/orders")
    public @ResponseBody List<CustomerOrder> getAllOrders() {
        return orderRepo.findAll();
    }
}


