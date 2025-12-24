package com.sangsang.autoblog.adapter.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignInReqeustDTO {
    private String username;
    private String password;
    private boolean rememberMe;
}
