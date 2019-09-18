package com.yang.strategy;

public class OldCustomerManyStratey implements Stratey {
    @Override
    public double getPrice(double standPrice) {
        return standPrice*0.8;
    }
}
