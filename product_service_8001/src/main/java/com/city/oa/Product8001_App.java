package com.city.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.city.oa.mapper")
@EnableEurekaClient //表示我是client端
public class Product8001_App {

    public static void main(String[] args) {
        SpringApplication.run(Product8001_App.class,args);
    }
}
