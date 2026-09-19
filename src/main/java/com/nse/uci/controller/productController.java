package com.nse.uci.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nse.uci.model.Product;
import com.nse.uci.service.ProductService;

@RestController
@RequestMapping("/product")
public class productController {

	private final ProductService productService;

	productController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/order")
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		try {

			Product savedProduct = productService.createProduct(product);

			return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error while uploading client : " + e.getMessage());
		}
	}

}
