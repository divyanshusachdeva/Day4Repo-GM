package com.graymatter;

public class CounterClass {

	private int count = 0;
	
	public synchronized void updateCount() {  // 2 ways to use synchronized is: Using in the function name itself OR synchronize() { ... }
//		synchronized (this) {
			count++;
			printCount();
//		}
	}
	
	public void printCount() {
		System.out.println(count);
	}
}
