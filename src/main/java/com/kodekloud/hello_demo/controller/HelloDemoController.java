package com.kodekloud.hello_demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController

public class HelloDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello KodeKloud Users!";
    }

}