package com.coco.main;

import com.coco.config.PersonConfig;
import com.coco.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);

		Person xiaoming = (Person) applicationContext.getBean("xiaoming");
		System.out.println("获取到Bean：" + xiaoming);


		applicationContext = new ClassPathXmlApplicationContext("application.xml");

		Person xiaohuang = (Person) applicationContext.getBean("xiaohuang");
		System.out.println("获取到Bean：" + xiaohuang);
	}
}
