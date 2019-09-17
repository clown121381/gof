package com.yang.decorator;

/**
 * 装饰器模式：动态的为一个类添加功能
 */
public interface ICar {
    void move();
}

/**
 * 被装饰对象
 */
class Car implements ICar{

    @Override
    public void move() {
        System.out.println("陆地上跑");
    }

}

class SuperCar implements ICar{

    private ICar car ;
    public SuperCar(ICar car){
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

class FlyCar extends SuperCar{

    public FlyCar(ICar car){
        super(car);
    }
    public void fly(){
        System.out.println("在天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}


class WaterCar extends SuperCar{

    public WaterCar(ICar car){
        super(car);
    }
    public void swim(){
        System.out.println("在水里游");
    }
    @Override
    public void move() {
        super.move();
        swim();
    }
}


class AiCar extends SuperCar{

    public AiCar(ICar car){
        super(car);
    }
    public void ai(){
        System.out.println("自动驾驶");
    }
    @Override
    public void move() {
        super.move();
        ai();
    }
}
