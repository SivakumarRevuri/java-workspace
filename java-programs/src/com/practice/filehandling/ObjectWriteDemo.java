package com.practice.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteDemo {
	public static void main(String[] args) {
		System.out.println("App start");

		User u1 = new User();
		u1.email = "ganesh@gmail.com";
		u1.phNumber = 9980517055L;
		u1.name = "Ganesh";

		FileOutputStream fos = null;
		try {
			/* connection stream */
			fos = new FileOutputStream("userinfo.txt");

			/* chain stream */
			ObjectOutputStream oops = new ObjectOutputStream(fos);

			oops.writeObject(u1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("App end");
	}
}
