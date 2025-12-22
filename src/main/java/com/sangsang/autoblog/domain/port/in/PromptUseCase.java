package com.sangsang.autoblog.domain.port.in;

import com.sangsang.autoblog.domain.model.Content;

public interface PromptUseCase {
    Content getPromptContent(String prompt);
}