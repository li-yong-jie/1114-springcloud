package com.aaa.jie.springcloud.UserService;

import com.aaa.jie.springcloud.Model.User;
import com.aaa.jie.springcloud.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/9 19org.apache.catalina.LifecycleException: Protocol handler start failed:30
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User>  selectAll(){
        return userMapper.selectAll();
    }
}
