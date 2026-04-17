package com.dependencyInjection;

public class Circle implements Shape{
    private Draw2d draw2d ;
    private Draw3d draw3d ;

    public Circle() {
    }

    public Circle(Draw2d draw2d, Draw3d draw3d) {
        this.draw2d = draw2d;
        this.draw3d = draw3d;
    }

    @Override
    public String getShapeName() {
        return "circle" ;
    }

    @Override
    public void drawShape() {
        draw2d.draw("Circle");
        draw3d.draw("circle");
    }

    public void connectionToDatabase (){
        System.out.println("connection to database .....");
    }
    public void disconnectionToDatabase (){
        System.out.println("disconnection from database .....");
    }

}
