package com.ecommerce.ecommerce_analytics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "E-Commerce Analytics Project Running Successfully!";
    }

    @GetMapping("/dashboard-test")
    @ResponseBody
    public String dashboardTest() {
        return "Dashboard Working";
    }

    @GetMapping("/dashboard-page")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/products-page")
    public String productsPage() {
        return "products";
    }

    @GetMapping("/add-product")
    public String addProductPage() {
        return "add-product";
    }
}