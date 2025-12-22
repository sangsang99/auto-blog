package com.sangsang.autoblog.adapter.in.web.preview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sangsang.autoblog.domain.model.Content;
import com.sangsang.autoblog.domain.port.in.PromptUseCase;


@Controller
public class ContentController {

    private final PromptUseCase promptUseCase;

    public ContentController(PromptUseCase promptUseCase) {
        this.promptUseCase = promptUseCase;
    }

    @GetMapping("/content")
    public String getContent(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /content with param: " + param);
        return "pages/preview/content";
    }
    
    
    @PostMapping("/prompt")
    public ModelAndView getPrompt(@RequestParam(value = "prompt", required = false) String prompt) {
        System.out.println("accessed /prompt with param: " + prompt);
        Content content = promptUseCase.getPromptContent(prompt);

        ModelAndView mav = new ModelAndView();
        mav.addObject("content", content);
        mav.setViewName("pages/preview/content");
        return mav;
    }
    
    
}
