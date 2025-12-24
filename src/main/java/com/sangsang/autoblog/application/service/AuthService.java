package com.sangsang.autoblog.application.service;

import org.springframework.stereotype.Service;

import com.sangsang.autoblog.adapter.in.web.dto.SignInReqeustDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SignInResponseDTO;
import com.sangsang.autoblog.domain.port.in.AuthUseCase;

@Service
public class AuthService implements AuthUseCase{
    @Override
    public SignInResponseDTO signIn(SignInReqeustDTO signInReqeustDTO) {
        System.out.println("remember-me: " + signInReqeustDTO.isRememberMe());
        SignInResponseDTO response = new SignInResponseDTO();
        response.setToken("dummy-token-12345");
        response.setTokenType("Bearer");
        response.setResultCode(0L);
        response.setResultMessage("Sign-in successful");
        return response;
    }
}
