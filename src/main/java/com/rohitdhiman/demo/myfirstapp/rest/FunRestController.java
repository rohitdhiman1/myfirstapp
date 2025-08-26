package com.rohitdhiman.demo.myfirstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose a "/" endpoint that return "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }



}
