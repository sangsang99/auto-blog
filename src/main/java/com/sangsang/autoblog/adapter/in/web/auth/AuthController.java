package com.sangsang.autoblog.adapter.in.web.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangsang.autoblog.adapter.in.web.dto.SignInReqeustDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SignInResponseDTO;
import com.sangsang.autoblog.domain.port.in.AuthUseCase;


@Controller
public class AuthController {
    
    private final AuthUseCase authUseCase;

    public AuthController(AuthUseCase authUseCase) {
        this.authUseCase = authUseCase;
    }

    @GetMapping("/signin")
    public String getLogin(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /signin with param: " + param);
        return "pages/auth/signin";
    }

    @PostMapping("/signin")
    public String postLogin(SignInReqeustDTO signInReqeustDTO) {
        SignInResponseDTO response = authUseCase.signIn(signInReqeustDTO);
        System.out.println("received token: " + response.getToken());
        return "redirect:home";
    }

    @GetMapping("/signup")
    public String getSignup(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /signup with param: " + param);
        return "pages/auth/signup";
    }
    
    
}
