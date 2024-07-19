package com.graymatter;

public class Main {

	public static void main(String[] args) throws AgeNotSufficientException {

		Person p = new Person ("Divyanshu" , "345612348907", 1);
		
		if (p.getAge() < 18)
			throw new AgeNotSufficientException("Person's age need to be equal to or more than 18.");
		else
		{
			System.out.println("The person is eligible to cast vote.");
			System.out.println(p);
		}
		
	}

}
