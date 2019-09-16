package com.yang.bridge;

/**
 * 两个维度彼此独立，电脑和品牌，
 *
 * 两个维度独立的增长和扩张，
 * 不用担心类的继承实现体系的变大
 * 使用聚合的方式，一个类可以使用
 * 另一个类的全部属性及变量
 */
public abstract class Computer {
    protected Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}

class DeskTop extends Computer {

    public DeskTop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

class LapTop extends Computer {

    public LapTop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本电脑");
    }
}

