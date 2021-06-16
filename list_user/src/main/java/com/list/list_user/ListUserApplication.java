package com.list.list_user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = "com.list.list_user_api")
public class ListUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListUserApplication.class, args);
    }

}
