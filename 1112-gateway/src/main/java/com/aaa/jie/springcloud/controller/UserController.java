package com.aaa.jie.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/13 21:52
 **/
@RestController
public class UserController {

    @RequestMapping("/all")
    public List<String> selectAll(){
        ArrayList<String> list = new ArrayList<String>();
        String str="人浏览浏览";
        list.add(str);
        return list;
    }
}
