package com.aaa.jie.springcloud.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/9 21:07
 **/
@Configuration
public class RestFulTemplates {
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }


}
