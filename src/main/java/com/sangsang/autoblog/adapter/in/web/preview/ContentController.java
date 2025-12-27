package com.sangsang.autoblog.adapter.in.web.preview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sangsang.autoblog.domain.model.AutoContent;
import com.sangsang.autoblog.domain.model.Prompt;
import com.sangsang.autoblog.domain.port.in.PromptUseCase;


@Controller
@RequestMapping("/content")
public class ContentController {

    private final PromptUseCase promptUseCase;

    public ContentController(PromptUseCase promptUseCase) {
        this.promptUseCase = promptUseCase;
    }

    @GetMapping("/preview")
    public String getSamplePreview() {
        AutoContent content = new AutoContent(); // Sample content for preview    
        ModelAndView mav = new ModelAndView();
        mav.addObject("content", content);
        mav.setViewName("pages/preview/content");
        return "pages/preview/content";
    }
    
    
    @PostMapping("/prompt")
    public ModelAndView getAutoContent(Prompt prompt) {
        AutoContent content = promptUseCase.getAutoContent(prompt);

        ModelAndView mav = new ModelAndView();
        mav.addObject("content", content);
        mav.setViewName("pages/preview/content");
        return mav;
    }
    
    
}
