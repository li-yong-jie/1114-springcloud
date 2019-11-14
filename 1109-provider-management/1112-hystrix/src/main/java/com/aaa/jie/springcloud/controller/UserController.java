package com.aaa.jie.springcloud.controller;

import com.aaa.jie.springcloud.Model.User;
import com.aaa.jie.springcloud.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/12 23:43
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    // @HystrixCommand(fallbackMethod ="selectAlls" )
    public List<User> selectAll() throws Exception {
        List<User> users = userService.selectAll();
        if(users.size()>0){
            throw new Exception("错误 错误");
        }
        return null;
    }
  /*  public List<User> selectAlls(){
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setUsername("网络延迟,请稍后再试");
        user.setId(10000);
        list.add(user);
        return list;

    }*/

}
