package com.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringBootExample1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExample1Application.class, args);
    }

}
