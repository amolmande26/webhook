package com.example.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/myApp")
public class RestController {

    @GetMapping("/getValue")
    public String getValue() {
        return "It's success call";
    }

}
