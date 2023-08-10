package com.atyaocheng.boot.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    StringRedisTemplate redisTemplate;
    @GetMapping("/hello")
    public String hello(){
        return "hello Spring Boot 3";
    }

    @GetMapping("/incr")
    public String incr(){
        Long haha = redisTemplate.opsForValue().increment("haha");
        return "inc" + haha;
    }
}

