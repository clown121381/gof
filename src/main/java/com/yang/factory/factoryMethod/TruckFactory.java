package com.yang.factory.factoryMethod;

public class TruckFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new truck();
    }
}
