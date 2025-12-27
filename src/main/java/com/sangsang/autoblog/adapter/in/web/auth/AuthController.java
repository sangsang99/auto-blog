package com.sangsang.autoblog.adapter.in.web.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangsang.autoblog.adapter.in.web.dto.CommonResponseDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SigninReqeustDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SigninResponseDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SignupReqeustDTO;
import com.sangsang.autoblog.domain.port.in.AuthUseCase;



@Controller
public class AuthController {
    
    private final AuthUseCase authUseCase;

    public AuthController(AuthUseCase authUseCase) {
        this.authUseCase = authUseCase;
    }

    @GetMapping("/signin")
    public String getSigninView(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /signin with param: " + param);
        return "pages/auth/signin";
    }

    @PostMapping("/signin")
    public String postSignin(SigninReqeustDTO signinReqeustDTO) {
        SigninResponseDTO response = authUseCase.signin(signinReqeustDTO);
        System.out.println("received token: " + response.getToken());
        return "redirect:home";
    }

    @GetMapping("/signup")
    public String getSignupView(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /signup with param: " + param);
        return "pages/auth/signup";
    }

    @PostMapping("/signup")
    public String postSignup(SignupReqeustDTO signupReqeustDTO) {
        CommonResponseDTO response = authUseCase.signup(signupReqeustDTO);
        System.out.println("Sign-up result code: " + response.getResultCode());
        return "redirect:signin";
    }
    
}
