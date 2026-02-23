package com.hero.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hero.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
