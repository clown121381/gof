package com.yang.factory.simpleFactory;

import org.junit.Test;

public class TestFactory {
    @Test
    public void test1(){
        CarFactory factory = new CarFactory();
        Car c1 = factory.createCar("train");
        Car c2 = factory.createCar("truck");
        c1.run();
        c2.run();
        c1.stop();
        c2.stop();
    }

}
