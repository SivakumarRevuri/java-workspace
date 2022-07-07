package com.practice.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjDemo {
	public static void main(String[] args) {
		System.out.println("App start");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("userinfo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			
			if (obj instanceof User) {
				User u = (User) obj;
				System.out.println(u.email);
				System.out.println(u.name);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("App end");
	}
}
