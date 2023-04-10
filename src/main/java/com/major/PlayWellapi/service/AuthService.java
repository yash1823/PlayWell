package com.major.PlayWellapi.service;

import com.major.PlayWellapi.payload.request.LoginRequest;
import com.major.PlayWellapi.payload.request.SignupRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<Object> login(LoginRequest loginRequest);
    ResponseEntity<Object> signup(SignupRequest signupRequest);
}