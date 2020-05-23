package com.linjingc.paydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@MapperScan("com.linjingc.paydemo.dao")
public class PayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayDemoApplication.class, args);
	}


}
