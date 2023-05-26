package com.example.SpringDatabaseOrderService;

import com.example.SpringDatabaseOrderService.Models.CustomerOrder;
import com.example.SpringDatabaseOrderService.Models.CustomerOrderWithName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    RestTemplate restTemplate;
    @Value("${customer-service.url}")
    private String customerServiceBaseUrl;

    private final OrderRepo orderRepo;

    public OrderController(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @RequestMapping("/orders")
    public @ResponseBody List<CustomerOrder> getAllOrders() {
        return orderRepo.findAll();
    }

    @GetMapping("/addOrder")
    public @ResponseBody String addCustomer(@RequestParam Long customerID) {
        CustomerOrder order = new CustomerOrder();
        order.setCustomerId(customerID);
        orderRepo.save(order);
        return "Order " + order.getId() + " has been saved.";
    }

    @RequestMapping("/order/{id}")
    public @ResponseBody CustomerOrderWithName getOrderByID(@PathVariable Long id){
       CustomerOrder order =  orderRepo.findById(id).get();
       String customerResourceURL = customerServiceBaseUrl + "/customers/" + order.getCustomerId() + "/name";
       String customerName = restTemplate.getForObject(customerResourceURL, String.class);

       return new CustomerOrderWithName(id, customerName);
    }
}


