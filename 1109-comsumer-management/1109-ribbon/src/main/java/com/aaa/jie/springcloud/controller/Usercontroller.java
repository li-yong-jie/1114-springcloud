package com.aaa.jie.springcloud.controller;

import com.aaa.jie.springcloud.Model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/11 19:45
 **/
@RestController
public class Usercontroller {
    private static final String URL ="http://USER-PROVIDER/";
   // private static final String URL = "http://BOOK-PROVIDER/";
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @RequestMapping("/all")
    public List<User> selectAll(){

        return restTemplate.getForObject(URL+"all", List.class);
    }
    @GetMapping("/allLB")
    public List<User> selectAllUser(){
        ServiceInstance choose = loadBalancerClient.choose("user-provider");
        String host = choose.getHost();
        int port = choose.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/all", List.class);
    }

}
