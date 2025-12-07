package com.sangsang.autoblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getDefault() {
        System.out.println("accessed /");
        return "home";
    }
    
    @GetMapping("/home")
    public String getHome() {
        System.out.println("accessed /home");
        return "home";
    }

    @GetMapping("/healthCheck")
    public String healthCheck() {
        System.out.println("Health check");
        return "home";
    }
}