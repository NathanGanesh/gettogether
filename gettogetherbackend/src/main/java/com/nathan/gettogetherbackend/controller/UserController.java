package com.nathan.gettogetherbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }
}
