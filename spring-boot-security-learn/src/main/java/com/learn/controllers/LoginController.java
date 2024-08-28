package com.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/public")
@RestController
public class LoginController {
    @GetMapping("/login")
    public String login() {
        return "This is the login page";
    }
}
