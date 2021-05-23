package com.pst.ems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	public static void main(String[] args) {
		String configLocation = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		GreetingImpl gi = context.getBean("g1", GreetingImpl.class);
		gi.setMessage("IMTIAZ");
		gi.greetingMessage();
	}

}
