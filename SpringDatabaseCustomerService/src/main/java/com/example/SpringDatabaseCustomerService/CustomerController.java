package com.example.SpringDatabaseCustomerService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    private final CustomerRepo customerRepo;

    public CustomerController(CustomerRepo customerRepo) {

        this.customerRepo = customerRepo;

    }

    @RequestMapping("/customers")
    public @ResponseBody List<Customer> allCustomers() {
        return customerRepo.findAll();
    }

    @RequestMapping("/customers/{id}")
    public @ResponseBody Customer getCustomer(@PathVariable long id) {
        return customerRepo.findById(id).orElse(null);
    }

    @GetMapping("/addCustomer")
    public @ResponseBody String addCustomer(@RequestParam String name, @RequestParam String ssn) {
        Customer customer = new Customer(name, ssn);
        customerRepo.save(customer);
        return "Customer " + customer.getName() + " has been saved.";
    }

    @GetMapping("/addCustomer/form")
    public String addCostumerForm() {
        return "addCustomer";
    }

    @RequestMapping("/customers/{id}/name")
    public @ResponseBody String getCustomerName(@PathVariable long id) {
        return customerRepo.findById(id).orElse(null).getName();
    }
}
