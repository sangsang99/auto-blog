package com.sangsang.autoblog.domain.model;

public class User {
    public final String email;
    public final String password;
    public final String extraInfo;
    public final String nickname;
    public final boolean agreeToTerms;

    public User(String email, String password, String extraInfo, String nickname, boolean agreeToTerms) {
        this.email = email;
        this.password = password;
        this.extraInfo = extraInfo;
        this.nickname = nickname;
        this.agreeToTerms = agreeToTerms;
    }
}
