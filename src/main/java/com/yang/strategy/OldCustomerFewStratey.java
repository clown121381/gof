package com.yang.strategy;

public class OldCustomerFewStratey implements Stratey {
    @Override
    public double getPrice(double standPrice) {
        return standPrice*0.85;
    }
}
