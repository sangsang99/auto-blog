package com.sangsang.autoblog.application.service;

import org.springframework.stereotype.Service;

import com.sangsang.autoblog.domain.model.Content;
import com.sangsang.autoblog.domain.port.in.PromptUseCase;
import com.sangsang.autoblog.domain.port.out.PromptPort;

@Service
public class PromptService implements PromptUseCase{

    private final PromptPort promptPort;
    public PromptService(PromptPort promptPort) {
        this.promptPort = promptPort;
    }

    @Override
    public Content getPromptContent(String prompt) {
        Content content = promptPort.getPromptContent(prompt);
        return content;
    }
}
