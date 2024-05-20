package com.agan.jdbcapinamedparametersdaolayer.sql_basic_without_liquibase.service;

import com.agan.jdbcapinamedparametersdaolayer.sql_basic_without_liquibase.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class ProductService {

//    @Autowired
    private ProductRepository productRepository;

    public List<Map<String, Object>> getProductNamesByName(String firstName) {

        return productRepository.getProductNamesByName(firstName);

    }
}
