package com.yang.factory.abstractFactory;

import com.yang.factory.adstractFactory.*;
import org.junit.Test;

/**
 * 工厂的工厂
 */
public class TestAbstractFatory {
    @Test
    public void test1(){
        AbstractFactory colorfactory = new ColorFactory();
        AbstractFactory shapefactory = new ShapeFactory();
        Color c = colorfactory.getColor("red");
        Shape s = shapefactory.getShape("circle");
        c.fill();
        s.draw();

    }
}
