package com.ecommerce.ecommerce_analytics.controller;

import com.ecommerce.ecommerce_analytics.entity.Sale;
import com.ecommerce.ecommerce_analytics.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping
    public Sale addSale(@RequestBody Sale sale) {
        return saleService.saveSale(sale);
    }

    @GetMapping
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    @GetMapping("/revenue")
    public Double getRevenue() {
        return saleService.getTotalRevenue();
    }

    @GetMapping("/test")
    public String test() {
        return "Sale Controller Working";
    }
}