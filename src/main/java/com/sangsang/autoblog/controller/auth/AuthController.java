package com.sangsang.autoblog.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AuthController {
    
    @GetMapping("/signin")
    public String getLogin(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /signin with param: " + param);
        return "pages/auth/signin";
    }

    @GetMapping("/signup")
    public String getSignup(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /signup with param: " + param);
        return "pages/auth/signup";
    }
    
    
}
