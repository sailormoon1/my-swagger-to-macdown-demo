package com.example.myswaggertomacdowndemo.service.impl;

import com.example.myswaggertomacdowndemo.entity.User;
import com.example.myswaggertomacdowndemo.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public User getUser() {
        User user = new User();
        user.setAge(10);
        user.setName("郭濛濛");
        user.setId(1);
        user.setBirthDay("2010-10-11");
        return user;
    }
}
