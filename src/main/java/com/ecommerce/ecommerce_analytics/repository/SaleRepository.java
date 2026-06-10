package com.ecommerce.ecommerce_analytics.repository;

import com.ecommerce.ecommerce_analytics.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}