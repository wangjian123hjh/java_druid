package com.example.springboot3_04_druid.domain;

import lombok.Data;

@Data
public class User {
    private String name;
    private String sex;

    public User(String name,String sex){
        this.name=name;
        this.sex=sex;
    }
}
