package com.yang.decorator;

/**
 * 装饰器模式
 * 可以自由的增加组装排列类的功能
 */
public class TestDecorator {
    public static void test1(){
        Car car = new Car();
        car.move();

        FlyCar fcar = new FlyCar(car);
        fcar.fly();
        WaterCar waterCar = new WaterCar(fcar);
        waterCar.swim();

        System.out.println("__________");
        AiCar a = new AiCar(new WaterCar(new FlyCar(car)));
        a.move();

    }

    public static void main(String[] args) {
        test1();
    }
}
