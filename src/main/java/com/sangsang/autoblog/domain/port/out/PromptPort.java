package com.sangsang.autoblog.domain.port.out;

import com.sangsang.autoblog.domain.model.Content;

public interface PromptPort {
    public Content getPromptContent(String prompt);
} 