package com.sangsang.autoblog.domain.model;

public class Signin {

    public final String userId;
    public final String email;
    public final boolean rememberMe;
    public final String password;

    public Signin(String userId, String password, boolean rememberMe) {
        if(userId == null || userId.isEmpty()) {
            throw new IllegalArgumentException("User ID cannot be null or empty");
        }
        this.userId = userId;
        this.email = userId;

        this.rememberMe = rememberMe;
        this.password = password;
    }

}
