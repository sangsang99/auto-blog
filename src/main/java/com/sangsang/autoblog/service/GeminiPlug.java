package com.sangsang.autoblog.service;

import org.springframework.stereotype.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@Service
public class GeminiPlug {
    public void testPlugin(){

        try (Client client = new Client()){
        // The client gets the API key from the environment variable `GEMINI_API_KEY`.
 
        GenerateContentResponse response =
            client.models.generateContent(
                "gemini-2.5-flash",
                "Explain how AI works in a few words",
                null);

        System.out.println(response.text());
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}