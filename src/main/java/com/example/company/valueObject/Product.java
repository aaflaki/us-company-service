package com.example.company.valueObject;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String foreignId;
    private String name;
    private String description;
}
