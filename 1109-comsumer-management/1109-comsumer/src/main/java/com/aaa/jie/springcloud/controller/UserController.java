package com.aaa.jie.springcloud.controller;

import com.aaa.jie.springcloud.Model.User;

import com.aaa.jie.springcloud.config.RestFulTemplates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/9 21:06
 **/
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/all")
    public List<User>  selectAll(){
        return restTemplate.getForObject("http://localhost:8081/all", List.class);
    }
}
