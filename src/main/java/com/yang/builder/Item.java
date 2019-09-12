package com.yang.builder;

/**
 * 使用一个个简单的对象构建一个复杂的对象，
 * 一个builder类会一步步的构造最终的对象
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
interface Packing {
    public String pack();
}
class Wrapper implements Packing{

    @Override
    public String pack() {
        return "wrapper";
    }
}
class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}
