# springboot_string_redis_template_demo测试了两个功能：1.StringRedisTemplate是如何使用的，2.Springboot启用缓存  这两个测试点点是独立的

1.搭建redis集群（redis集群有两种模式：cluster模式和哨兵模式）

2.启动命令：spring-boot:run  -Dspring.profiles.active=fat

3.spring-boot-starter-data-redis会读取配置文件application.yml中的 ：spring.redis.cluster.notes 





