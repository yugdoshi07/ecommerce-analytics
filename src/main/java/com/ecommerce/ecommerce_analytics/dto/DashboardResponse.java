package com.ecommerce.ecommerce_analytics.dto;

public class DashboardResponse {

    private long totalProducts;
    private long totalSales;
    private double totalRevenue;

    public DashboardResponse() {
    }

    public DashboardResponse(long totalProducts, long totalSales, double totalRevenue) {
        this.totalProducts = totalProducts;
        this.totalSales = totalSales;
        this.totalRevenue = totalRevenue;
    }

    public long getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(long totalProducts) {
        this.totalProducts = totalProducts;
    }

    public long getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(long totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}