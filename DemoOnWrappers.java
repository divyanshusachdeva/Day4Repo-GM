package com.graymatter;

public class DemoOnWrappers {

	public static void main(String[] args) {
		
		
		// Primitive to Wrapper
		
		int i = 67;
		Integer iObj = i;  // we can also do like Integer iObj = (Integer)i;
		
		System.out.println(i);  // The value will be 67
		System.out.println(iObj);  // The value will be 67
		
		
		// Wrapper to Primitive
		
		int j = iObj.intValue();
		System.out.println(j);  // The value will be 67
	
		
		// String to Wrapper
				
		String sInt = "78";
		
		Integer i1 = Integer.parseInt(sInt); // To convert a String to Wrapper, we use Integer.parseInt()
		System.out.println(i1);
		
		
		// Wrapper to String
		
		String s = i1.toString();
		System.out.println(s);
	
		
		String str = "Hello";
		Object obj = str; // Upcasting - Child reference to parent
		
		String s1 = (String) obj; // Downcasting - Parent to child - explicit conversion
	
		
		
		
		
		
		
		
		
	}

}
