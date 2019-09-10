package com.yang.factory.simpleFactory;

/**
 *  简单工厂模式
 *
 */
public class CarFactory {
    public Car createCar(String type){
        if(type == "train"){
            return new train();
        }else if(type == "truck"){
            return new truck();
        }else{
            return null;
        }
    }
}
