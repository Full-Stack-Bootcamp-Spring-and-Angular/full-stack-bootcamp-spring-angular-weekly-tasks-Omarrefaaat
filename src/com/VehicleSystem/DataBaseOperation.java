package com.VehicleSystem.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @ToString
    public class DataBaseOperation {

        @Value("${database.url}")
        private String url;
        @Value ("${database.username}")
        private String username;
        @Value ("${database.password}")
        private String password;


        public void storeVehicleIntoDataBase (String vehicleName){
            System.out.println(String.format("Connecting into database with url=%s , username=%s, password=%s ",url,username,password));
            System.out.println(String.format("Store Vehicle Into Data Base %s", vehicleName));
        }
}
