package com.pst.ems;


public class GreetingImpl implements Greeting {
	private String message;

	public GreetingImpl(String message) {
		this.message = message;
	}

	@Override
	public void greetingMessage() {
		// TODO Auto-generated method stub
		System.out.println("Hello" + message);

	}

}
