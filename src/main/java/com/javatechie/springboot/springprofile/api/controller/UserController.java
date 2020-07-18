package com.javatechie.springboot.springprofile.api.controller;

import com.javatechie.springboot.springprofile.api.service.UserService;
import com.javatechie.springboot.springprofile.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring-profile")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user)
    {
         userService.saveUser(user);
         return "User Added";
    }

    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable int userId)
    {
        return  userService.getUser(userId);
    }

}
