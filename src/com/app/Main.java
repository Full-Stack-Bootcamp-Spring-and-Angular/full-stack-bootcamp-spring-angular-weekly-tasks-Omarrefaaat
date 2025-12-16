package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circle = (Circle)  container.getBean("Circle");
        System.out.println(circle.getArea());

        Square square = (Square)  container.getBean("Square");
        System.out.println(square.getArea());
    }
}