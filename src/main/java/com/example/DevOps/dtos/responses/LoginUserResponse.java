package com.example.DevOps.dtos.responses;

import lombok.Data;

@Data
public class LoginUserResponse {
    private String email;
    private boolean loggedIn;
    private String message;

}
