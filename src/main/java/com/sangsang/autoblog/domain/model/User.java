package com.sangsang.autoblog.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class User {
    private String email;
    private String password;
    private String extraInfo;
    private String nickname;
    private boolean agreeToTerms;

    User(String email, String password, String extraInfo, String nickname, boolean agreeToTerms) {
        this.email = email;
        this.password = password;
        this.extraInfo = extraInfo;
        this.nickname = nickname;
        this.agreeToTerms = agreeToTerms;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }

    public String extraInfo() {
        return extraInfo;
    }

    public String nickname() {
        return nickname;
    }

    public boolean agreeToTerms() {
        return agreeToTerms;
    }
}
