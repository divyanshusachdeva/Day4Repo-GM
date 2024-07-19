package com.graymatter;

public class DemoOnExceptions {

	public static void doDiv(int a, int b) {
		if(b==0)
			throw new ArithmeticException();
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) {

		int nume, i;
		nume = 7;
		int deno[] = {1, 2, 3, 4};
		
		try {
			
			for(i = 0 ; i <= deno.length ; i++)
			{
				if(deno[i] == 0) {
					
				}
					
			}
		System.out.println(nume/deno[i]); 
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException ae) {	
			System.out.println("---Exception here--- Cannot divide by 0");
		}
		
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// We can give multiple catch methods. As soon as the it is satisfied, the rest of the catch will be skipped.
		
		finally {
			System.out.println("Finally block reached");

		}
		
		// Even if there is no exception, the finally block will still run.
		
		
		doDiv(5,0);
		
		System.out.println("End of main block"); // After handling the exception, this line got executed.
		
		
		
		
	
	}

}
