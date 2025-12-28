package com.sangsang.autoblog.adapter.in.web.dto;

import com.sangsang.autoblog.domain.model.Signin;

import lombok.Setter;

@Setter
public class SigninReqeustDTO {

    private String userId;
    private String password;
    private boolean rememberMe;

    public Signin toSigninDomain() {
        return new Signin(userId, password, rememberMe);
    }

}
