package com.agan.jdbcapinamedparametersdaolayer.service;

import com.agan.jdbcapinamedparametersdaolayer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Map<String, Object>> getProductNamesByName(String firstName) {

        return productRepository.getProductNamesByName(firstName);

    }
}
