package com.VehicleSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Plane implements Vehicle{
    private int id ;
    private String model ;
    private VehicleType type = VehicleType.PLANE;
@Autowired
    public void setDataBaseOperation(DataBaseOperation dataBaseOperation) {
        this.dataBaseOperation = dataBaseOperation;
    }

    private DataBaseOperation dataBaseOperation;
    @Override
    public void storeVehicle() {
        dataBaseOperation.storeVehicleIntoDataBase("Plane");

    }

}
