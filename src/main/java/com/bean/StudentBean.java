package com.bean;

public class StudentBean {

	private String firstName, lastName;

	public StudentBean() {
		System.out.println("StudentBean()");
	}

	// init -> any name
	
	
	public void init() {
		firstName = "ravan";
		lastName = "ram";
		System.out.println("init()");
	}

	public void remove() {
		firstName = null;
		lastName = null;
		System.out.println("remove()");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
