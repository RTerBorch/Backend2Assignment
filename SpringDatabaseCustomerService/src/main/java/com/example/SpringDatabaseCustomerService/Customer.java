package com.example.SpringDatabaseCustomerService;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String ssn;

    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
