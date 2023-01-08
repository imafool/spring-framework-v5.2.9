package com.coco.config;

import com.coco.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

	@Bean
	public Person xiaoming(){
		return new Person(1L, "xiaoming");
	}
}
