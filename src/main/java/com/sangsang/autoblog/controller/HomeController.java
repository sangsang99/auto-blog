package com.sangsang.autoblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sangsang.autoblog.service.GeminiClient;

@Controller
public class HomeController {

    final GeminiClient geminiClient = new GeminiClient();

    @GetMapping("/")
    public String getDefault() {
        System.out.println("accessed /");
        return "home";
    }
    
    @GetMapping("/home")
    public String getHome() {
        System.out.println("accessed /home");

        String result = geminiClient.getTestText();
        System.out.println("Gemini response: " + result);

        return "home";
    }

    @GetMapping("/healthCheck")
    public String healthCheck() {
        System.out.println("Health check");
        return "home";
    }
}