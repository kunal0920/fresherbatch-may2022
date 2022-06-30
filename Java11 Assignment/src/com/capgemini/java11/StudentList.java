package com.capgemini.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StudentList {
	public static void main(String[] args) {
		var path = "C:/Users/Vaibhav/Downloads/Studentlist.txt";
		try {
			String data = Files.readString(Path.of(path));
			
			System.out.println(data);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

