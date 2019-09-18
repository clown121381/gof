package com.yang.strategy;

public class NewCustomerfewStratey implements Stratey {
    @Override
    public double getPrice(double standPrice) {
        System.out.println("不打折");
        return standPrice;
    }
}
