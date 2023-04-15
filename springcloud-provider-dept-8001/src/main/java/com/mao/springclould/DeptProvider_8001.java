package com.mao.springclould;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mao
 * @createTime 2022/11/20 15:53
 * @Description: DeptProvider_8001的主启动类
 */
@SpringBootApplication
@MapperScan("com.mao.springclould.dao")
public class DeptProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class,args);
    }
}
