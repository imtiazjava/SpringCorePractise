package com.pst.ems;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("ameerpet")
	private String street;
	@Value("hyd")
	private String city;
	@Value("ts")
	private String state;
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}


}
