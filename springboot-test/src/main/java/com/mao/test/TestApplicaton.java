package com.mao.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mao
 * @createTime 2022/12/11 17:13
 * @Description: springboot项目的测试主启动类
 */
@SpringBootApplication
@MapperScan("com.mao.test.mapper")
public class TestApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(TestApplicaton.class,args);
    }
}
