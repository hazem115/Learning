package com.example.conversation.user.presintation.controller;


import com.example.conversation.user.presistance.entity.User;
import com.example.conversation.user.presistance.repo.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    UserRepo userRepo;
    @GetMapping
    List<User> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping
    User createUser(@RequestBody User user){
        return userRepo.save(user);
    }
}
