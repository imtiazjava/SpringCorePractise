package com.bms.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	int id;
	String name;
	double salary;

	int arr[];
	String s[];

	Employee emp;
	Employee e[];

	List<Employee> list;
	Set<Employee> set;
	Map<Integer, String> map;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public void setS(String[] s) {
		this.s = s;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void setE(Employee[] e) {
		this.e = e;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	public void setSet(Set<Employee> set) {
		this.set = set;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public void print() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.salary);
		for (int i : arr) {
			System.out.println(i);
		}
		for (String ss : s) {
			System.out.println(ss);
		}
		System.out.println(e.toString());
		for (Employee ee : e) {
			System.out.println(ee.toString());
		}

		list.forEach(s -> System.out.println(s));
		set.forEach(s -> System.out.println(s));
		Set ss = map.entrySet();
		Iterator it = ss.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
