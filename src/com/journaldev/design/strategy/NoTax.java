package com.journaldev.design.strategy;

public class NoTax implements TaxStrategy {
    public double calculateTax(double amount) {
        return 0;
    }
}
