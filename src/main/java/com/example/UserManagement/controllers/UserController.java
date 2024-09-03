package com.example.UserManagement.controllers;

import com.example.UserManagement.dtos.requests.RegisterUserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/users")
@RestController
public class UserController {

    @PostMapping
    public ResponseEntity<?> registerUser(@RequestBody RegisterUserRequest request){
        return null;
    }
}
