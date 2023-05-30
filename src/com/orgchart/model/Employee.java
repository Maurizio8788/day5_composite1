package com.orgchart.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String position;
	
	
	public Employee(String firstName, String lastName, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}


	public String getInformation() {
		return "The employee: " + firstName + " " + lastName + " with position " + position;
	}
	
}
