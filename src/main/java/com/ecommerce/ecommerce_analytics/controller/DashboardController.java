package com.ecommerce.ecommerce_analytics.controller;

import com.ecommerce.ecommerce_analytics.dto.DashboardResponse;
import com.ecommerce.ecommerce_analytics.repository.ProductRepository;
import com.ecommerce.ecommerce_analytics.repository.SaleRepository;
import com.ecommerce.ecommerce_analytics.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SaleService saleService;

    @GetMapping("/dashboard")
    public DashboardResponse getDashboard() {

        long totalProducts = productRepository.count();
        long totalSales = saleRepository.count();
        double totalRevenue = saleService.getTotalRevenue();

        return new DashboardResponse(
                totalProducts,
                totalSales,
                totalRevenue
        );
    }
}