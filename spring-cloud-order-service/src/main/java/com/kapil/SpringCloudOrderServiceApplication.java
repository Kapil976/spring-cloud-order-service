package com.kapil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOrderServiceApplication.class, args);
	}

}
