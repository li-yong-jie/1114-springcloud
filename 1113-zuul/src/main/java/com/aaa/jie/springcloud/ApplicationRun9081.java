package com.aaa.jie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author 李永杰
 * @Date 2019/11/13 19:53
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationRun9081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun9081.class,args);
    }
}
