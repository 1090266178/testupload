package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller_hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello nono";
    }
}
