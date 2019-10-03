package com.group8.mocknetflixapi.controllers;

import com.group8.mocknetflixapi.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    ApiResponse index() {
        return new ApiResponse("Mock Netflix API");
    }
}
