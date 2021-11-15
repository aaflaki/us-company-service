package com.example.company.valueObject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductTest {

    @Autowired
    RestTemplate restTemplate;
    @Test
    public void testInterServiceCalls() {
        Product product = restTemplate.getForObject("http://PRODUCT/products/1", Product.class);
        System.out.println(product);
    }
}