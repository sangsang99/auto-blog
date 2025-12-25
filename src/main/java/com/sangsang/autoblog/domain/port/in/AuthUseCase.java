package com.sangsang.autoblog.domain.port.in;

import com.sangsang.autoblog.adapter.in.web.dto.CommonResponseDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SigninReqeustDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SigninResponseDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SignupReqeustDTO;

public interface AuthUseCase {
    SigninResponseDTO signin(SigninReqeustDTO signinReqeustDTO);
    CommonResponseDTO signup(SignupReqeustDTO signupReqeustDTO);
}
