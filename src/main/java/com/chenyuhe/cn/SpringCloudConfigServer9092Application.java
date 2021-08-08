package com.chenyuhe.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// @EnableConfigServer的注解
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServer9092Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServer9092Application.class, args);
	}

}
