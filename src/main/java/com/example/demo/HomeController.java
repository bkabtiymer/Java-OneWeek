package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Notifies the program that we are using controllers
public class HomeController {

    @RequestMapping("/")//tells the browser what URL request to refer to
    public String homePage(){ //Method
        return "index"; //HTML that will be returned to the user


    }
}
