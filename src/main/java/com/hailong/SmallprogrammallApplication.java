package com.hailong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hailong.mapper")
public class SmallprogrammallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallprogrammallApplication.class, args);
	}

}
