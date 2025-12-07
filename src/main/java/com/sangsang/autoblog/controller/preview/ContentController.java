package com.sangsang.autoblog.controller.preview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ContentController {

    @GetMapping("/content")
    public String getContent(@RequestParam(value = "param", required = false) String param) {
        System.out.println("accessed /content with param: " + param);
        return "pages/preview/content";
    }
    
    
}
