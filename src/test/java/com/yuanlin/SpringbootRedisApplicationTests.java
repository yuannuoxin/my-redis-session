package com.yuanlin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    @SuppressWarnings("")
    private RedisTemplate<Object,Object> billredisTemplate;
    @Test
    public void stringTest() {
        stringRedisTemplate.opsForValue().set("k5", "Springboot redis");
        System.out.println(stringRedisTemplate.opsForValue().get("k5"));
    }
    @Test
    public void objectTest() {
        billredisTemplate.opsForValue().set("yuanlin", new User(1,"yuanlin","jiayou"));
        System.out.println(billredisTemplate.opsForValue().get("yuanlin"));
    }
}
