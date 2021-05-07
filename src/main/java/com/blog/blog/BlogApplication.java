package com.blog.blog;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.blog.bloguser.mapper")
@EnableSwagger2
@Import({
    com.blog.base.emailApi.config.Config.class,
    com.blog.base.userApi.config.Config.class
})
@EnableFeignClients(basePackages = {
    com.blog.base.emailApi.config.Config.API_BASE_PACKAGE,
    com.blog.base.userApi.config.Config.API_BASE_PACKAGE
})
public class BlogApplication {
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
