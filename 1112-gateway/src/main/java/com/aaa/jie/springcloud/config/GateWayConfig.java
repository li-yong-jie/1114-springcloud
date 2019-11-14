package com.aaa.jie.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 李永杰
 * @Date 2019/11/13 21:33
 **/
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){



        return routeLocatorBuilder.routes()
                .route("baidu-route",
                        p -> p.path("/baidu").
                                filters(f -> f.addRequestHeader("name", "zhangsan"))
                                .uri("http://www.baidu.com")).build();
    }
}
