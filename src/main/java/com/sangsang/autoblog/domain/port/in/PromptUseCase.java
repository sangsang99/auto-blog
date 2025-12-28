package com.sangsang.autoblog.domain.port.in;

import com.sangsang.autoblog.domain.model.PostContent;
import com.sangsang.autoblog.domain.model.Prompt;

public interface PromptUseCase {
    PostContent getAutoContent(Prompt prompt);
}