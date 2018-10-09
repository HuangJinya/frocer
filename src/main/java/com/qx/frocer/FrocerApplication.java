package com.qx.frocer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.qx.controller","com.qx.service","com.qx.wx","com.qx.redis","com.qx.conf"})
@EntityScan("com.qx.bean")
@EnableJpaRepositories("com.qx.dao")
@SpringBootApplication
public class FrocerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrocerApplication.class, args);
	}
}
