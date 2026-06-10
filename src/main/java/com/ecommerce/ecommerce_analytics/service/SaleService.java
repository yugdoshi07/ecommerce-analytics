package com.ecommerce.ecommerce_analytics.service;

import com.ecommerce.ecommerce_analytics.entity.Sale;
import com.ecommerce.ecommerce_analytics.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    public Sale saveSale(Sale sale) {
        return saleRepository.save(sale);
    }

    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    public Double getTotalRevenue() {
    return saleRepository.findAll()
            .stream()
            .filter(sale -> sale.getTotalAmount() != null)
            .mapToDouble(Sale::getTotalAmount)
            .sum();
    }
}