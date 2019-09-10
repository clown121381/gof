package com.yang.factory.factoryMethod;

import org.junit.Test;

public class TestFactory {
    @Test
    public void test1(){
        CarFactory factory1 = new TrainFactory();
        CarFactory factory2 = new TruckFactory();
        Car c1 = factory1.createCar();
        Car c2 = factory2.createCar();

        c1.run();
        c2.run();
        c1.stop();
        c2.stop();

    }
}
