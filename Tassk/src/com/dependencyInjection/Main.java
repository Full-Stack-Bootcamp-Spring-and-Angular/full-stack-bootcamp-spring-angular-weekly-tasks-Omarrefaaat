package com.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circle = container.getBean("myCircle" , Circle.class);
        circle.drawShape();
        ((ClassPathXmlApplicationContext)container).close();

        ApplicationContext container1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Rectangle rectangle = container1.getBean("rectangle" ,Rectangle.class);
        rectangle.drawShape();
        ((ClassPathXmlApplicationContext)container1).close();






    }
}