package com.yang.factory.adstractFactory;

import com.yang.factory.adstractFactory.*;
/**
 * 工厂的工厂
 */
public class TestAbstractFatory {
    public void test1(){
        AbstractFactory colorfactory = new ColorFactory();
        AbstractFactory shapefactory = new ShapeFactory();
        Color c = colorfactory.getColor("red");
        Shape s = shapefactory.getShape("circle");
        c.fill();
        s.draw();

    }
}
