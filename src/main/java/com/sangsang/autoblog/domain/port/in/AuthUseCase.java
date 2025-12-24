package com.sangsang.autoblog.domain.port.in;

import com.sangsang.autoblog.adapter.in.web.dto.SignInReqeustDTO;
import com.sangsang.autoblog.adapter.in.web.dto.SignInResponseDTO;

public interface AuthUseCase {
    SignInResponseDTO signIn(SignInReqeustDTO signInReqeustDTO); 
}
