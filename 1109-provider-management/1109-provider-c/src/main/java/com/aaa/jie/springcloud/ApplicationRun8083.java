package com.aaa.jie.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 李永杰
 * @Date 2019/11/11 19:22
 **/
@SpringBootApplication
@MapperScan("com.aaa.jie.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class,args);
    }
}
