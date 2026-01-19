package com.sstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sstapp.entity.User;
import com.sstapp.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepo;

    @PostMapping("/register")
    public User register(@RequestBody User u) {

        return userRepo.save(u);
    }

    @PostMapping("/login")
    public String login(@RequestBody User u) {

        User user = userRepo.findByEmail(u.getUserEmail());
        if(user != null && user.getUserPass().equals(u.getUserPass())) {
            return "Login Successfull";
        }

        return "Invalid Credentials.. Try Again";
    }
}
