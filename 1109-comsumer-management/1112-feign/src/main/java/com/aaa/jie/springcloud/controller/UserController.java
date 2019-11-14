package com.aaa.jie.springcloud.controller;

import com.aaa.jie.springcloud.Model.User;
import com.aaa.jie.springcloud.service.ISpringcloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/12 22:58
 **/
@RestController
public class UserController {
    @Autowired
    private ISpringcloudService iSpringcloudService;

    @RequestMapping("/all")
   // @HystrixCommand(fallbackMethod ="selectAlls" )
    public List<User> selectAll() throws Exception {
        return  iSpringcloudService.serlectAll();


    }

}
