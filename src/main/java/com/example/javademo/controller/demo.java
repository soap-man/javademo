package com.example.javademo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {

    @RequestMapping("/index")
    public String index(){
        return "OK";
    }

}
