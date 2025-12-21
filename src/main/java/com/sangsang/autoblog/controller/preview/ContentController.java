package com.sangsang.autoblog.controller.preview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sangsang.autoblog.data.Content;
import com.sangsang.autoblog.service.GeminiClient;


@Controller
public class ContentController {

    @GetMapping("/content")
    public String getContent(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /content with param: " + param);
        return "pages/preview/content";
    }
    
    
    @PostMapping("/prompt")
    public ModelAndView getPrompt(@RequestParam(value = "prompt", required = false) String prompt) {
        System.out.println("accessed /prompt with param: " + prompt);
        GeminiClient geminiClient = new GeminiClient();
        Content content = geminiClient.getPromptContents(prompt);

        ModelAndView mav = new ModelAndView();
        mav.addObject("content", content);
        mav.setViewName("pages/preview/content");
        return mav;
    }
    
    
}
