package com.edu;

public class Employee {
	
	private String name;
	private String age;
	private String company;

	

	public Employee(String name, String age, String company) {
		super();
		this.name = name;
		this.age = age;
		this.company = company;
	}

	public Employee(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Company: " + company);
	}


	public Employee() {
		super();
		System.out.println("No Arg Constructor");
	}
	
	

}
