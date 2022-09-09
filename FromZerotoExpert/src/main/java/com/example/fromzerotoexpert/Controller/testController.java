package com.example.fromzerotoexpert.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping ("/FromZerotoExpert")
    public String hello() {
        return "嗨，欢迎您来到 from zero to expert.";
    }
}
