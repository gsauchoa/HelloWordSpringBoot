package com.itau.SpringBootREST.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/about")
    public String about(){
        return "Hello World " ;
    }
}
