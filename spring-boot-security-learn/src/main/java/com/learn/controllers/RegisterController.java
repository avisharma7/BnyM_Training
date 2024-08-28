package com.learn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; /**
 * RegisterController handles requests for the registration page.
 */
@RestController
@RequestMapping("/public")
public class RegisterController {
    @GetMapping("/register")
    public String register() {
        return "This is the registration page";
    }
}
