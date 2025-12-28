package com.sangsang.autoblog.application.service;

import org.springframework.stereotype.Service;

import com.sangsang.autoblog.domain.model.Signin;
import com.sangsang.autoblog.domain.model.User;

import com.sangsang.autoblog.domain.port.in.AuthUseCase;

@Service
public class AuthService implements AuthUseCase{

    @Override
    public Signin signin(Signin signinInfo) {
        // TODO : 인증 로직 구현
        return signinInfo;
    }

    @Override
    public User signup(User newUser) {
        // TODO : 회원가입 로직 구현
        return newUser;
    }
}
