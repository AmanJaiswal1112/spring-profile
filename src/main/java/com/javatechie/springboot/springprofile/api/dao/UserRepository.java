package com.javatechie.springboot.springprofile.api.dao;

import com.javatechie.springboot.springprofile.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
