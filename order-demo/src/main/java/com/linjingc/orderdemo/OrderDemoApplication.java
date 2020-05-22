package com.linjingc.orderdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.linjingc.orderdemo.dao")
public class OrderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderDemoApplication.class, args);
	}

}
