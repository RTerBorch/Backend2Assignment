package com.example.SpringDatabaseOrderService.Modells;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomerOrderWithName {

    private Long id;

    private String customerName;

}
