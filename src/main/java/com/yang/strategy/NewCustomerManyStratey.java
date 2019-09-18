package com.yang.strategy;

public class NewCustomerManyStratey implements Stratey {
    @Override
    public double getPrice(double standPrice) {
        System.out.println("打九折");
        return standPrice*0.9;
    }
}
