package com.linjingc.paydemo;

import com.linjingc.paydemo.config.DataSourceProxyAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Import(DataSourceProxyAutoConfiguration.class)
@MapperScan("com.linjingc.paydemo.dao")
public class PayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayDemoApplication.class, args);
	}

}
