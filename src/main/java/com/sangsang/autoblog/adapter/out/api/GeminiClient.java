package com.sangsang.autoblog.adapter.out.api;

import org.springframework.stereotype.Component;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import com.sangsang.autoblog.domain.model.Content;
import com.sangsang.autoblog.domain.port.out.PromptPort;

import io.github.cdimascio.dotenv.Dotenv;

@Component
public class GeminiClient implements PromptPort {

    private final Dotenv dotenv;

    public GeminiClient() {
        this.dotenv = Dotenv.load();
    }

    public String getTestText(){

        String result = "";
        String apiKey = dotenv.get("GEMINI_API_KEY");
        Client client = Client.builder().apiKey(apiKey).build();

        try (client){
            GenerateContentResponse response =
                client.models.generateContent(
                    "gemini-2.5-flash",
                    "Explain how AI works in a few words",
                    null);

            result = response.text(); 
         
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public Content getPromptContent(String prompt){

        Content content = new Content();
        String apiKey = dotenv.get("GEMINI_API_KEY");
        Client client = Client.builder().apiKey(apiKey).build();

        try (client){
            GenerateContentResponse response =
                client.models.generateContent(
                    "gemini-2.5-flash",
                    "make a title in a few words for blog post about " + prompt,
                    null);

            content.setTitle(response.text()); 

            response =
                client.models.generateContent(
                    "gemini-2.5-flash",
                    "make a body in a few sentences for blog post about " + prompt,
                    null);
         
            content.setBody(response.text()); 

        } catch (Exception e) {
            e.printStackTrace();
        }

        return content;
    }
 
}