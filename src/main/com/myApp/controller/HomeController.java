package main.com.myApp.controller;

import main.com.myApp.Dao.DatabaseOperation;
import main.com.myApp.Dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

import java.util.Date;

@Controller
public class HomeController
{
    DatabaseOperation databaseOperation;

    @Autowired
    public void setDatabaseOperation(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }



    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("email") String email, @RequestParam("birthDay")@DateTimeFormat(pattern="yyyy-MM-dd") Date birthDay, Model model) throws SQLException {
        User user = new User(firstName, lastName, email, birthDay);
        databaseOperation.saveUser(user);
        model.addAttribute("message", "user has been saved successfully");
        return "resultPage";
    }
}
