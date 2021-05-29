package com.htproject.htproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Good day to have chat with your ht people, stay safe and sound";
    }
}
