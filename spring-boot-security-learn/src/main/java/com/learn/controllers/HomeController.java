package com.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController handles requests for the home page.
 */
@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "This is the homepage";
    }
}

