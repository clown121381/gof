package com.yang.factory.factoryMethod;

public class train implements Car {
    @Override
    public void run() {
        System.out.println("火车启动。。。。。");
    }

    @Override
    public void stop() {
        System.out.println("火车停车。。。。");
    }
}
