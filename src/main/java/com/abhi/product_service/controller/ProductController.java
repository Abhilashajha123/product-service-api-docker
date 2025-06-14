package com.abhi.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.product_service.entity.Product;
import com.abhi.product_service.services.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/product")
	public Product createProduct(@RequestBody Product product) {
		
		return productService.createProduct(product);
	}
	
	
	@GetMapping("/product")
	public List<Product> getproduct() {
		
		return productService.getAllProduct();
	}

}
