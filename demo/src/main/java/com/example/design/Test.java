package com.example.design;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println(calculateDiscountAmounts());
    }
    public static List<Double> calculateDiscountAmounts() {
        List<Double> discountAmounts = new ArrayList<>();

        double totalAmount = 100L;

        // 创建优惠策略对象
        DiscountStrategy directDiscountStrategy = new DirectDiscountStrategy(0.1); // 直接扣减比例为10%
        DiscountStrategy percentageDiscountStrategy = new PercentageDiscountStrategy(0.2); // 折扣比例为20%
        DiscountStrategy deductionDiscountStrategy = new DeductionDiscountStrategy(50.0); // 抵扣金额为50元

        // 计算并添加优惠金额
        discountAmounts.add(directDiscountStrategy.calculateDiscount(totalAmount));
        discountAmounts.add(percentageDiscountStrategy.calculateDiscount(totalAmount));
        discountAmounts.add(deductionDiscountStrategy.calculateDiscount(totalAmount));

        return discountAmounts;
    }
}
