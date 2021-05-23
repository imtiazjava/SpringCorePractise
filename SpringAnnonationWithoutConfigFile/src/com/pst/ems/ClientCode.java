package com.pst.ems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientCode {

	public static void main(String[] args) {

	 ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	 GreetingImpl gi = context.getBean("g1", GreetingImpl.class);

	 gi.greetingMessage();
	  
	
	}

}
