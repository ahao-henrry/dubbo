package com.ahao.boot.dubboproviderboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboProviderBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderBootApplication.class, args);
    }

}
