package com.aaa.jie.springcloud.fallUser;

import com.aaa.jie.springcloud.Model.User;
import com.aaa.jie.springcloud.service.ISpringcloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/13 17:11
 **/
@Component
public class ISpringcloudFactory implements FallbackFactory<ISpringcloudService> {
    @Override
    public ISpringcloudService create(Throwable throwable) {
        return new ISpringcloudService() {
            @Override
            public List<User> serlectAll() {
                System.out.println("厉害了");
                return null;
            }
        };
    }
}
