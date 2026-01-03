package com.sangsang.autoblog.domain.model;

public class User {
    public final String email;
    public final String password;
    public final String extraInfo;
    public final String userName;
    public final boolean agreeToTerms;

    public User(String email, String password, String extraInfo, String userName, boolean agreeToTerms) {
        this.email = email;
        this.password = password;
        this.extraInfo = extraInfo;
        this.userName = userName;
        this.agreeToTerms = agreeToTerms;
    }
}
