package com.ahao.dubbo.dubboconsumerboot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboConsumerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerBootApplication.class, args);
    }

}
