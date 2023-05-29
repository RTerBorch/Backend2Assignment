package com.example.SpringDatabaseProductService;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    @Pattern(regexp = "^.+$", message = "Enter name")
    private String name;
    @Min(value = 1, message = "Value cant be 0")
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
