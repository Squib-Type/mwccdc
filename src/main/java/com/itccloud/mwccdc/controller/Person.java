package com.itccloud.mwccdc.controller;

public class Person {

	public Person(String firstName, String lastName, String gender, String adress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.adress = adress;
		
	}
	
	
	private String firstName;
	private String lastName;
	private String gender;
	private String adress;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", adress=" + adress +
				  "]";
	}
}
