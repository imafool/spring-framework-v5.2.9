package com.coco.main;

import com.coco.config.PersonConfig;
import com.coco.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person xiaoming = (Person) applicationContext.getBean("xiaoming");
		System.out.println("获取到Bean：" + xiaoming);
	}
}
