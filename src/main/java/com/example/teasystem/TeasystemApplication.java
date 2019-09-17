package com.example.teasystem;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




/***
 * 系统框架
 */
@MapperScan("com.example.teasystem.mapper")
@SpringBootApplication
public class TeasystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeasystemApplication.class, args);
    }

}
