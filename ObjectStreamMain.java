package com.graymatter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class ObjectStreamMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Customer c = new Customer("Divyanshu", 44);
		
		FileOutputStream fos = new FileOutputStream("obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Customer c1 = (Customer)ois.readObject();
		System.out.println(c1);
		
		File f = new File("myfile.txt");
		f.createNewFile();
		
		
	}

}
