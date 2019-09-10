package com.yang.factory.adstractFactory;

public interface AbstractFactory {
    Color getColor(String color);
    Shape getShape(String shape);
}
