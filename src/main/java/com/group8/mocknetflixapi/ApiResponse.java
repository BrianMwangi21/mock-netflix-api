package com.group8.mocknetflixapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ApiResponse {
    @Getter
    @JsonProperty("message")
    private String message;
}
