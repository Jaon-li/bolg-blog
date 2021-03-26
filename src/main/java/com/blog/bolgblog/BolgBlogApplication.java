package com.blog.bolgblog;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blog.bloguser.mapper")
@NacosPropertySource(dataId = "blog-service.yaml", autoRefreshed = true)
public class BolgBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BolgBlogApplication.class, args);
    }

}
