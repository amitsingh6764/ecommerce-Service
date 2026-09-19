package com.nse.uci.service;

import org.springframework.stereotype.Service;

import com.nse.uci.model.Product;
import com.nse.uci.repo.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}
