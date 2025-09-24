package com.ricardo.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("hello")
    public String hello() {
        return "hello world";
    }

    @PostMapping("hello")
    public String sayHello(String name) {
        return "hello " + name;
    }
}
