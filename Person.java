package com.graymatter;

public class Person {

	private String name;
	private String aadharId;
	private int age;
	
	
	public Person() {
		super();
	}
	
	
	public Person(String name, String aadharId, int age) {
		super();
		this.name = name;
		this.aadharId = aadharId;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", aadharId=" + aadharId + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAadharId() {
		return aadharId;
	}


	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

	
	
}
