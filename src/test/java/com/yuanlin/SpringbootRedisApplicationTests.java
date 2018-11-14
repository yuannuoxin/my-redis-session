package com.yuanlin;

import com.yuanlin.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@CacheConfig(cacheNames = "SpringbootRedisApplicationTests")
public class SpringbootRedisApplicationTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    @SuppressWarnings("")
    private RedisTemplate<Object,Object> billredisTemplate;
    @Autowired
    private TestService testService;
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
    @Test
    public void ServiceTest() {
        for (int i=0;i<5;i++){
            System.out.println(testService.getAllUsers());
        }
    }
}
