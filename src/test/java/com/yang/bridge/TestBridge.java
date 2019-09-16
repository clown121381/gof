package com.yang.bridge;

import org.junit.Test;

public class TestBridge {
    @Test
    public void test1(){
        Computer computer = new LapTop(new Lenovo());
        computer.sale();
    }
}
