package com.example.myspring.controller;

import com.example.myspring.classes.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @GetMapping("/")
    public String returnStringMethod() {
        return "Hello";
    }

    @GetMapping("/hello")
    public Test returnObjectMethod() {
        Test test = new Test();
        test.c = test.sayHello();

        return test;
    }
}
