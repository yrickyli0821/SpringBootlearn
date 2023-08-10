package com.atyaocheng.boot.contoller;

import com.atyaocheng.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@SpringBootConfiguration
@Configuration //这是一个配置类
public class AppConfig {
    @Bean("userhaha")
    public User user(){
        var user = new User();
        user.setId(1L);
        user.setName("zhangsan");
        return user;
    }
}
