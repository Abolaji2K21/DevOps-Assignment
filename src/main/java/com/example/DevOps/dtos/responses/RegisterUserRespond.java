package com.example.DevOps.dtos.responses;

import lombok.Data;

@Data
public class RegisterUserRespond {
    private Long Id;
    private String email;
    private String message;
    private boolean loggedIn;
}
