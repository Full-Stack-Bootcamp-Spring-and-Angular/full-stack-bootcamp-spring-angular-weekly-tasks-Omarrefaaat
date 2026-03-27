package main.User;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class UserModel {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private  String username;
    private String password;
    private String country;
    private String ProgrammingLanguage;

    public List<String> getPreferredOperationSystems() {
        return preferredOperationSystems;
    }

    public void setPreferredOperationSystems(List<String> preferredOperationSystems) {
        this.preferredOperationSystems = preferredOperationSystems;
    }

    private List<String> preferredOperationSystems ;

    public String getProgrammingLanguage() {
        return ProgrammingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ProgrammingLanguage = programmingLanguage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



}
