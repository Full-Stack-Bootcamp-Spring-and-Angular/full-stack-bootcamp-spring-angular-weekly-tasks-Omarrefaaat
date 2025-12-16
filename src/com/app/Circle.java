package com.app;

public class Circle implements Shape {
    double radius = 3 ;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

}
