package com.sangsang.autoblog.application.service;

import org.springframework.stereotype.Service;

import com.sangsang.autoblog.adapter.in.web.dto.CommonResponseDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SigninReqeustDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SigninResponseDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SignupReqeustDTO;
import com.sangsang.autoblog.domain.port.in.AuthUseCase;

@Service
public class AuthService implements AuthUseCase{
    @Override
    public SigninResponseDTO signin(SigninReqeustDTO signinReqeustDTO) {
        System.out.println("remember-me: " + signinReqeustDTO.isRememberMe());
        SigninResponseDTO response = new SigninResponseDTO();
        response.setToken("dummy-token-12345");
        response.setTokenType("Bearer");
        response.setResultCode(0L);
        response.setResultMessage("Sign-in successful");
        return response;
    }

    @Override
    public CommonResponseDTO signup(SignupReqeustDTO signupReqeustDTO) {
        System.out.println("Signing up user: " + signupReqeustDTO.getEmail());
        System.out.println("Nickname: " + signupReqeustDTO.getNickname());
        System.out.println("Extra Info: " + signupReqeustDTO.getExtraInfo());
        System.out.println("Agreed to Terms: " + signupReqeustDTO.isAgreeToTerms());
        System.out.println("Password: " + signupReqeustDTO.getPassword());
        CommonResponseDTO response = new CommonResponseDTO();
        response.setResultCode(0L);
        response.setResultMessage("Sign-up successful");
        return response;    
    }
}
