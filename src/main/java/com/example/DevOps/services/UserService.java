package com.example.DevOps.services;

import com.example.DevOps.data.models.User;
import com.example.DevOps.dtos.requests.RegisterUserRequest;
import com.example.DevOps.dtos.responses.RegisterUserRespond;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    RegisterUserRespond register(RegisterUserRequest request);
    User findUserBy(String username);

}
