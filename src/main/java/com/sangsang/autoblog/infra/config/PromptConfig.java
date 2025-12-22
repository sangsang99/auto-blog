package com.sangsang.autoblog.infra.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sangsang.autoblog.domain.port.out.PromptPort;

@Configuration
public class PromptConfig {
    
    @Bean
    public PromptPort promptPort(
        @Qualifier("geminiClient") PromptPort geminiClient
    ) {
        return geminiClient;
    }
}