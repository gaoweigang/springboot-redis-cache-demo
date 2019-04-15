package com.gwg.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwg.demo.common.cache.BaseCache;

@RestController
@Component
public class BaseService {
	
	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@Autowired
	private BaseCache baseCache;
	
	@RequestMapping("/hello")
	public void hello(){
		System.out.println("redisTemplate:"+redisTemplate);
		redisTemplate.opsForValue().set("name", "高红成");
		String name = redisTemplate.opsForValue().get("name");
		System.out.println(name);
	}
	
	@RequestMapping("/cache")
	public void testCache(){
		System.out.println("test cache start....");
		System.out.println(baseCache.queryNameByCode("gaoweigang"));
		
	}

}
