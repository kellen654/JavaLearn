package com.example.design;

public class DirectDiscountStrategy implements DiscountStrategy {
    private double discountRate;

    public DirectDiscountStrategy(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount(double totalAmount) {
        return totalAmount * discountRate;
    }
}