package com.aaa.jie.springcloud.service;

import com.aaa.jie.springcloud.Model.User;
import com.aaa.jie.springcloud.fallUser.ISpringcloudFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/12 22:47
 **/
@FeignClient( value = "USER-PROVIDER",fallbackFactory= ISpringcloudFactory.class)
public interface ISpringcloudService {
    @RequestMapping("/all")
    List<User> serlectAll();
}
