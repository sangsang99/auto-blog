package com.sangsang.autoblog.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DotEnvConfig {
        private final Dotenv dotenv;

    /**
     * DotEnv 로드 및 데이터 조회
     */
    public DotEnvConfig() {
        this.dotenv = Dotenv.configure()
                .ignoreIfMalformed()
                .ignoreIfMissing()
                .load();
    }

    @Bean
    public Dotenv dotenv() {
        return this.dotenv;
    }
}
