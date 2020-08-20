package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @Value("${name}")
    private String name;

    @PostMapping("/name")
    public String sayName(String msg) {
        return "name: " + name + "  " + msg;
    }
}
