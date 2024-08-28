package com.learn.controllers;

import com.learn.models.User;
import com.learn.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllers {

    @Autowired
    private UserServices userServices;


    // Get all users
    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userServices.getAllUsers();
    }

    //Get Single User
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{username}")
    public User getUser( @PathVariable("username") String username){
        return this.userServices.getUser(username);
    }

    @PostMapping("/")
    public User addUser(@RequestBody  User user){
        this.userServices.addUser(user);
        return user;
    }
}
