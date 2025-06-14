package com.abhi.product_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.product_service.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Long> {

}
