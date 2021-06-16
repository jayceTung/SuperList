package com.list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.list.user")
public class ListTradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListTradeApplication.class, args);
	}

}
