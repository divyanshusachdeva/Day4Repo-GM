package com.graymatter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoOnFiles {

	public static void main(String[] args) throws IOException {

		File file = new File("demo.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.canExecute());
		
		
//		Writing in file
		
		FileWriter fw = new FileWriter(file);
		String str = "Hello World";
		for(char c:str.toCharArray()) {
			fw.write(c);
		}
		
		fw.close();
		
		
		
//		Reading from file
		
		FileReader fr = new FileReader(file);
		int ch;
		
		StringBuffer sbf = new StringBuffer();

		while ((ch = fr.read()) != -1)
		    sbf.append((char)ch); 
		
		String s = sbf.toString();
		
		fr.close();

		System.out.println(s);
		
	}
}
