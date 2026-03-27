package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("year") int year, @RequestParam("month") int month,@RequestParam("day") int day, Model model){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year,month,day);
        Period age = Period.between(birthday,today);
        String result = "your age is " +  age.getYears() + "Year" + age.getMonths() + "Month" + age.getDays() + "day" ;
        model.addAttribute("result",result);
        return "resultPage";
    }
}
