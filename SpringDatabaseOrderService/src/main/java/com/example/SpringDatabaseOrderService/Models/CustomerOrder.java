package com.example.SpringDatabaseOrderService.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrder {
    @Id
    @GeneratedValue
    private Long id;

    private Long customerId;

    @ElementCollection
    private List<Long> itemIDList;

}
