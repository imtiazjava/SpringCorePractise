package com.bms.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	Test ref = context.getBean("test",Test.class);
	ref.print();

	}

}
