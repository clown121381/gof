package com.yang.factory.adstractFactory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == "red"){
            return new Red();
        }else if(color == "green") {
            return new Green();
        }else if(color == "blue"){
            return new Blue();
        }else{
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
