package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.AuthenticationResponse;
import com.cognizant.spring_learn.util.JwtUtil;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(Authentication authentication){

        String token=

                JwtUtil.generateToken(authentication.getName());

        return new AuthenticationResponse(token);

    }

}