package com.simon.springbootmysqldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.simon.springbootmysqldemo.mapper")
public class SpringBootMysqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlDemoApplication.class, args);
	}

}
