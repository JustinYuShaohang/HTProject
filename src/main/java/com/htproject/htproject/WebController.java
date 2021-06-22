package com.htproject.htproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("")
    public String welcome(){
        return "Welcome to this page, for more details pls view the README.MD";
    }
}
