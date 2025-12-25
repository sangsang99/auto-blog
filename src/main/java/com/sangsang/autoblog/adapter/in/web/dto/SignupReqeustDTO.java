package com.sangsang.autoblog.adapter.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignupReqeustDTO {
    private String email;
    private String password;
    private String extraInfo;
    private String nickname;
    private boolean agreeToTerms;
}
