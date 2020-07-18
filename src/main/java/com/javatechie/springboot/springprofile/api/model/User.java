package com.javatechie.springboot.springprofile.api.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_profile")
public class User
{
    @GeneratedValue
    @Id
    private int id;
    private String name;


}
