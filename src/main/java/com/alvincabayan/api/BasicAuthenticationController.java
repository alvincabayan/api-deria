package com.alvincabayan.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvincabayan.model.AuthenticationBean;

@RestController
public class BasicAuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticate() {
        //throw new RuntimeException("Some Error has Happened! Contact Support at ***-***");
        return new AuthenticationBean("You are authenticated");
    }   
}