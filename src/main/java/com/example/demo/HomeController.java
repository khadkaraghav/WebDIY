package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/code")
    public String getCode(){
        return"code";
    }

    @RequestMapping("/photoshop")
    public String getPhotoshop(){
        return "photoshop";
    }
}