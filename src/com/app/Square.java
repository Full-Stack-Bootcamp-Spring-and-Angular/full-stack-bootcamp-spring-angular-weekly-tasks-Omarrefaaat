package com.app;

public class Square implements Shape {
    double side =3 ;


    @Override
    public double getArea() {
        return side * side;
    }
}
