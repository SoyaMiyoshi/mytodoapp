package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping("/hello")
    public String sayHello(){
        return("Hello, Hi!");
    }

}
