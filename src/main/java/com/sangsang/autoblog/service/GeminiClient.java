package com.sangsang.autoblog.service;

import org.springframework.stereotype.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

import io.github.cdimascio.dotenv.Dotenv;

@Service
public class GeminiClient {

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
 
}