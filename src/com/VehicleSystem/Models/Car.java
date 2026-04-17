package com.VehicleSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements Vehicle{
    private int id ;
    private String model ;
    private VehicleType type = VehicleType.CAR;



    private DataBaseOperation dataBaseOperation;

    @Autowired
    public Car(DataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }
    @Override
    public void storeVehicle() {
        dataBaseOperation.storeVehicleIntoDataBase("car");
    }
}
