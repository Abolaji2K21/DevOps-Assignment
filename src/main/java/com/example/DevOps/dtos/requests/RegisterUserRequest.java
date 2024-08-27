package com.example.DevOps.dtos.requests;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String email;
    private String password;
}
