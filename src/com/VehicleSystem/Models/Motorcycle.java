package com.VehicleSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Motorcycle implements Vehicle {
    private int id ;
    private String model ;
    private VehicleType type = VehicleType.BIKE;

    @Autowired
    private DataBaseOperation dataBaseOperation ;




    @Override
    public void storeVehicle() {

    }
}
