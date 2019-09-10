package com.yang.factory.adstractFactory;

public class ShapeFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == "circle"){
            return new Circle();
        }else if(shape == "rectangle"){
            return new Rectangle();
        }else if(shape == "square"){
            return new Square();
        }else{
            return null;
        }
    }
}
