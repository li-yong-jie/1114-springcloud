package com.aaa.jie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 李永杰
 * @Date 2019/11/12 22:34
 **/
@SpringBootApplication
@EnableFeignClients(basePackages = "com.aaa.jie.springcloud")
@EnableDiscoveryClient
public class ApplicationRun7083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7083.class,args);
    }
}
