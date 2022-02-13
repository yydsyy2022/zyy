package com.lanqiao.zyy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lanqiao.zyy.mapper")
public class ZyyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZyyApplication.class, args);
    }

}
