package com.pst.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("${emp.id}")
	private int id;
	@Value("${emp.name}")
	private String name;
	@Value("${emp.salary}")
	private double salary;
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	
}
