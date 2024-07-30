package com.kodekloud.hello_demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class HelloDemoApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Hello KodeKloud Users!";
    }

}
