package com.owner.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = {"com.owner.service"})
@SpringBootApplication
public class MasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MasterApplication.class, args);
	}
}
