package com.sangsang.autoblog.adapter.in.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller

@Tag(name = "Home-Controller", description = "HomePage & Health Check")
public class HomeController {

    @GetMapping("/")
    public String getWelcome() {
        return "home";
    }

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }

    @GetMapping("/healthCheck")
    @ResponseBody
    @Operation(summary = "Health Check", description = "서버 상태 확인")
    @ApiResponse(responseCode = "200", description = "OK")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }
}