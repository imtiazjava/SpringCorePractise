package com.pst.ems;

import org.springframework.stereotype.Component;

@Component("g1")
public class GreetingImpl implements Greeting {
	private String message;

	public GreetingImpl() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void greetingMessage() {
		// TODO Auto-generated method stub
		System.out.println("Hello" + message);

	}

}
