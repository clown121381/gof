package com.yang.factory.factoryMethod;

public class TrainFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new train();
    }
}
