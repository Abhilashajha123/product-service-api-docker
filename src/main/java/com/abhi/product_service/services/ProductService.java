package com.abhi.product_service.services;

import java.util.List;

import com.abhi.product_service.entity.Product;

public interface ProductService {
	
	Product createProduct(Product product);
	List<Product> getAllProduct();

}
