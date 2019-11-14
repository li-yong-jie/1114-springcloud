package com.aaa.jie.springcloud.mapper;
import com.aaa.jie.springcloud.Model.User;
import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/9 19:21
 **/
public interface UserMapper {
    List<User> selectAll();
}
