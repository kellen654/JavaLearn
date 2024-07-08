package com.example.design;


public class DeductionDiscountStrategy implements DiscountStrategy {
    private double deductionAmount;

    public DeductionDiscountStrategy(double deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    @Override
    public double calculateDiscount(double totalAmount) {
        return Math.min(totalAmount, deductionAmount);
    }
}