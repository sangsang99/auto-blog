package com.sangsang.autoblog.application.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.sangsang.autoblog.domain.model.AutoContent;
import com.sangsang.autoblog.domain.model.Prompt;
import com.sangsang.autoblog.domain.port.in.PromptUseCase;
import com.sangsang.autoblog.domain.port.out.PromptPort;

@Service
public class PromptService implements PromptUseCase{

    private final PromptPort promptPort;
    public PromptService(PromptPort promptPort) {
        this.promptPort = promptPort;
    }

    @Override
    public AutoContent getAutoContent(Prompt prompt) {
        
        AutoContent content = null;
        
        try {
            String title = promptPort.genTextByPrompt(prompt.pasingToTitle());
            String body = promptPort.genTextByPrompt(prompt.pasingToBody());
            String[] tags = {""};
            String summary = "";
            String imageUrl = "";
            // String[] tags = promptPort.genTextByPrompt(prompt.pasingToTags()).split(",");
            // String summary = promptPort.genTextByPrompt(prompt.pasingToSummary());
            // String imageUrl = promptPort.genTextByPrompt(prompt.pasingToImageUrl());
            Date createdAt = new Date();

            content = new AutoContent(title, body, tags, imageUrl, summary, createdAt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return content;
    }
}
