package com.sangsang.autoblog.domain.port.in;

import com.sangsang.autoblog.domain.model.Signin;
import com.sangsang.autoblog.domain.model.User;

public interface AuthUseCase {
    Signin signin(Signin SigninInfo);
    User signup(User newUser);
}
