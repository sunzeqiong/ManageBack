package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("api/login")
    public List<UserEntity> list(@RequestBody UserEntity userEntity) {
//  简单方法    return userService.list();
        System.out.println("传参"+userEntity);
        return userService.getUser();
    }

    //新增
    @PostMapping("/save")
    public boolean save(@RequestBody UserEntity userEntity) {
        return userService.save(userEntity);
    }

}
