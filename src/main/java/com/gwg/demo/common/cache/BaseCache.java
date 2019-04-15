package com.gwg.demo.common.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 使用@EnableCaching注解启用缓存
 * 启用缓存之后，第一次会执行方法，后面均从缓存中取
 */
@Component
public class BaseCache {

    //查询快件类型
    @Cacheable(value = "base", key = "'queryNameByCode' + #code")
    public String queryNameByCode(String code){
    	System.out.println("如果进入方法里面了 说明没走缓存");
    	if("gaoweigang".equals(code)){
    		return "高伟刚";
    	}else if("zhoubingjie".equals(code)){
    		return "周冰洁";
    	}
        return "高红程";
    }
    
    //删除缓存
    
    //更新缓存
    
 
    
}
