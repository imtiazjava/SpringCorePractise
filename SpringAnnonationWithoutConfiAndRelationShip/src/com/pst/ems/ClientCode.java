package com.pst.ems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientCode {

	public static void main(String[] args) {

	 ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	 Employee emp = context.getBean("employee", Employee.class);
	 System.out.println(emp.toString());
	 
	
	}

}
