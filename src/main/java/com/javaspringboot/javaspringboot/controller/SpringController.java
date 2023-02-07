package com.javaspringboot.javaspringboot.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/get")
    public String getMethod(){
        return "Helo";
    }
}
