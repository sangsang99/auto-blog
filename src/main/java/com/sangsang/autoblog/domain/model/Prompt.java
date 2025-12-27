package com.sangsang.autoblog.domain.model;

import java.io.File;

public class Prompt {

    public String promptText;
    public final File[] promptFiles;

    public Prompt(String promptText, File[] promptFiles) {
        this.promptText = promptText;
        this.promptFiles = promptFiles;
    }

    public Prompt pasingToTitle(){
        this.promptText = "Generate a blog title in a few words for the following prompt: " + promptText;
        return this;
    }

    public Prompt pasingToBody(){
        this.promptText = "Generate a detailed blog body in a 2000 bytes for the following prompt: " + promptText;
        return this;
    }

    public Prompt pasingToTags(){
        this.promptText = "Generate relevant tags with comma separated for the following blog prompt: " + promptText;
        return this;
    }   

    public Prompt pasingToSummary(){
        this.promptText = "Generate a concise summary in a 200 bytes for the following blog prompt: " + promptText;
        return this;
    }

    public Prompt pasingToImageUrl(){
        this.promptText = "Generate an image description use freeSite for the following blog prompt: " + promptText;
        return this;
    }   
}
