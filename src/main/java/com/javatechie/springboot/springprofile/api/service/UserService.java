package com.javatechie.springboot.springprofile.api.service;

import com.javatechie.springboot.springprofile.api.dao.UserRepository;
import com.javatechie.springboot.springprofile.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = { "practice","dev"})
public class UserService
{
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user)
    {
        userRepository.save(user);
    }

    public User getUser(int userId)
    {
        return userRepository.findOne(userId);
    }
}
