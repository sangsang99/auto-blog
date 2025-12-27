package com.sangsang.autoblog.domain.port.out;

import com.sangsang.autoblog.domain.model.Prompt;

public interface PromptPort {
    public String genTextByPrompt(Prompt prompt) throws Exception;
} 