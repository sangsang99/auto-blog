package com.sangsang.autoblog.domain.port.in;

import com.sangsang.autoblog.domain.model.Signin;
import com.sangsang.autoblog.domain.model.User;

public interface AuthUseCase {
    User signin(Signin SigninInfo);
    User signup(User newUser);
}
