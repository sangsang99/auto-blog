package com.sangsang.autoblog.domain.port.in;

import com.sangsang.autoblog.domain.model.AutoContent;
import com.sangsang.autoblog.domain.model.Prompt;

public interface PromptUseCase {
    AutoContent getAutoContent(Prompt prompt);
}