package main.com.myApp.controller;

import main.User.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.Period;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String showHomePage(Model model)
    {

        UserModel userModel = new UserModel();
        model.addAttribute("userModel", userModel);

        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("userModel")UserModel userModel, Model model){
        String username = userModel.getUsername();

        userModel.setUsername(username);
        model.addAttribute("userModel",userModel);
        return "resultPage";
    }
}
