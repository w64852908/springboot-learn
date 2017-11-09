package com.lanxiang.springboot;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by lanxiang on 2017/7/17.
 */

@SpringBootApplication(exclude = MybatisAutoConfiguration.class)
@ComponentScan(basePackages = "com.lanxiang.springboot")
@ImportResource(locations = {"classpath:applicationContext.xml"})
public class AppStarter {

    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }

}
