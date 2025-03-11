package com.journaldev.design.strategy;

public class LuxuryTax implements TaxStrategy {
    public double calculateTax(double amount) {
        return amount * 0.2;
    }
}
