package com.journaldev.design.strategy;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double getFinalPrice() {
        return price + taxStrategy.calculateTax(price);
    }
}
