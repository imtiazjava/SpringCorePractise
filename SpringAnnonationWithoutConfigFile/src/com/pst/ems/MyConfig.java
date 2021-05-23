package com.pst.ems;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean(name="g1")
	public GreetingImpl getGreetingImpl(){
		return new GreetingImpl(" imtiaz");
	}
}
