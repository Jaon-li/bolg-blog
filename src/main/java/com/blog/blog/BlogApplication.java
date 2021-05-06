package com.blog.blog;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blog.bloguser.mapper")
public class BlogApplication {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
