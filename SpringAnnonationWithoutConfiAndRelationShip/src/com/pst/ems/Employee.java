package com.pst.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1001")
	private int id;
	@Value("imtiaz")
	private String name;
	@Value("30000.00")
	private double salary;
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	
}
