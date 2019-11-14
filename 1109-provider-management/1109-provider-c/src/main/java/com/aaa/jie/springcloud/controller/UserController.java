package com.aaa.jie.springcloud.controller;

import com.aaa.jie.springcloud.Model.User;
import com.aaa.jie.springcloud.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/9 20:04
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<User> serlectAll(){
        System.out.println("3333");
     return userService.selectAll();



    }
}
