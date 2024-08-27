package com.example.DevOps.services;

import com.example.DevOps.data.models.User;
import com.example.DevOps.dtos.requests.LoginUserRequest;
import com.example.DevOps.dtos.requests.RegisterUserRequest;
import com.example.DevOps.dtos.responses.LoginUserResponse;
import com.example.DevOps.dtos.responses.RegisterUserRespond;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    RegisterUserRespond register(RegisterUserRequest request);
    LoginUserResponse login(LoginUserRequest loginUserRequest);
    User findUserBy(String username);

}
