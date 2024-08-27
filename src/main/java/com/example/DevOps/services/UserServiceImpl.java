package com.example.DevOps.services;

import com.example.DevOps.data.models.User;
import com.example.DevOps.data.repositories.UserRepository;
import com.example.DevOps.dtos.requests.RegisterUserRequest;
import com.example.DevOps.dtos.responses.RegisterUserRespond;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserRespond register(RegisterUserRequest request) {
        if (userRepository.findByEmail(request.getEmail()) != null) {
            throw new RuntimeException("A user with email " + request.getEmail() + " already exists.");
        }

        User user = new User();
        BeanUtils.copyProperties(request, user);

        User savedUser = userRepository.save(user);

        RegisterUserRespond response = new RegisterUserRespond();
        BeanUtils.copyProperties(savedUser, response);
        response.setMessage("User registered successfully.");

        return response;
    }

    @Override
    public User findUserBy(String email) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("User with email " + email + " not found");
        }
        return user;
    }
}
