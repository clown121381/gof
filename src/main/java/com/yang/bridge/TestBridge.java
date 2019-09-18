package com.yang.bridge;


public class TestBridge {
    public void test1(){
        Computer computer = new LapTop(new Lenovo());
        computer.sale();
    }
}
