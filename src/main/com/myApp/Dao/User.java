package main.com.myApp.Dao;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter @Setter
public class User {
        String firstName;
        String lastName;
        String email;
        Date birthDay;

    public User(String firstName, String lastName, String email, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDay = birthDay;
    }
}
