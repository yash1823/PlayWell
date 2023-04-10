package com.major.PlayWellapi.controller;

import com.major.PlayWellapi.payload.request.LoginRequest;
import com.major.PlayWellapi.payload.request.SignupRequest;
import com.major.PlayWellapi.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;


    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequest signupRequest) {
        return authService.signup(signupRequest);
    }



    @PostMapping("/login")
    public  ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {

        return authService.login(loginRequest);
    }
}
