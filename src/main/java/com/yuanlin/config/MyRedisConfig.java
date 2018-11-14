package com.yuanlin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
public class MyRedisConfig {

    /**
     * 自定义redis序列化器
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    public RedisTemplate<Object,Object> billredisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object,Object> templateFor = new RedisTemplate<Object,Object>();
        templateFor.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Object> ser = new Jackson2JsonRedisSerializer<Object>(Object.class);
        templateFor.setDefaultSerializer(ser);
        return templateFor;
    }
}
