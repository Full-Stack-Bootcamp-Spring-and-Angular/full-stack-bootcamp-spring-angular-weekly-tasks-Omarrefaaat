package com.VehicleSystem;

import com.VehicleSystem.Models.Car;
import com.VehicleSystem.Models.ConfigClass;
import com.VehicleSystem.Models.Motorcycle;
import com.VehicleSystem.Models.Plane;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ConfigClass.class);
        Car car = (Car) container.getBean("car");
        car.storeVehicle();

        Plane plane = (Plane) container.getBean("plane");
        plane.storeVehicle();

        Motorcycle motorcycle = (Motorcycle) container.getBean("motorcycle");
        motorcycle.storeVehicle();
        container.close();
    }
}
