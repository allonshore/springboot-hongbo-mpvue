package com.hongbo.mpvue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.hongbo.mpvue.mapper")
@EnableAutoConfiguration
@SpringBootApplication
public class SpringbootHongboMpvueApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootHongboMpvueApplication.class, args);
	}
}
