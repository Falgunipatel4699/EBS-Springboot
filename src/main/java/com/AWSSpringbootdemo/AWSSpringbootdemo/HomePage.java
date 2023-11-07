package com.AWSSpringbootdemo.AWSSpringbootdemo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @RequestMapping("/homepage")
    public String home(){
        return "Welcome to my Home Page";


    }
}
