package com.example.community1.community1;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.community1.community1.mapper")
public class Community1Application {

	public static void main(String[] args) {
		SpringApplication.run(Community1Application.class, args);
	}

}
