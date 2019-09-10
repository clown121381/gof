package com.yang.factory.simpleFactory;

public class truck implements Car {
    @Override
    public void run() {
        System.out.println("卡车启动");
    }

    @Override
    public void stop() {
        System.out.println("卡车停车");
    }
}
