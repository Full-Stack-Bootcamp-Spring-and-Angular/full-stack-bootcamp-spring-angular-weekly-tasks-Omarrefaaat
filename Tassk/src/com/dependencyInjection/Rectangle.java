package com.dependencyInjection;

public class Rectangle implements Shape{
    private Draw2d draw2d ;
    private Draw3d draw3d ;

    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    @Override
    public String getShapeName() {
        return "com.dependencyInjection.Rectangle";

    }

    @Override
    public void drawShape() {
        draw2d.draw("com.dependencyInjection.Rectangle");
        draw3d.draw("com.dependencyInjection.Rectangle");
    }

    public void connectionToDatabase (){
        System.out.println("connection to database .....");
    }
    public void disconnectionToDatabase (){
        System.out.println("disconnection from database .....");
    }

}
