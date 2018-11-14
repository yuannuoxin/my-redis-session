package com.yuanlin.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "userService")
public class TestService {
    @Cacheable(value = "getAllUsers")
    public String getAllUsers() {
        System.out.println("getAllUsers  调用了");
        return "com.yuanlin.service.TestService";
    }
}
