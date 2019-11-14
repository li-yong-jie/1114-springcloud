package com.aaa.jie.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author 李永杰
 * @Date 2019/11/14 20:44
 **/
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun5081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun5081.class,args);
    }
}
