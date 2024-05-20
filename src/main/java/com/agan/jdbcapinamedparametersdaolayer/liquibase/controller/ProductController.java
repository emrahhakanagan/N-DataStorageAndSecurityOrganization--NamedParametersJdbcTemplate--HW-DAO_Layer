package com.agan.jdbcapinamedparametersdaolayer.liquibase.controller;

import com.agan.jdbcapinamedparametersdaolayer.liquibase.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/liquibase")
@AllArgsConstructor
public class ProductController {

    //    @Autowired
    private ProductService productService;


    @GetMapping("/fetch-product")
    public ResponseEntity getProductNamesByName(@RequestParam String firstName) {

        var listProducts = productService.getProductNamesByName(firstName);

        return ResponseEntity.ok(listProducts);
    }
}