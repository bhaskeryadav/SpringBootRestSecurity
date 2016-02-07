package com.spring.rest.web.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.spring.rest.web.service","com.spring.rest.web.security"})
public class SpringRestWebSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestWebSecurityApplication.class, args);
	}
}
