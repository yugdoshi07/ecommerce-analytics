package com.ecommerce.ecommerce_analytics.repository;

import com.ecommerce.ecommerce_analytics.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}