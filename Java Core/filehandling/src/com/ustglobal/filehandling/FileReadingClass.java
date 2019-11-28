package com.ustglobal.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	 public static void main(String[] args) throws IOException {
		String path ="C:\\Users\\rajpu\\Desktop\\gajju.txt";
		FileReader reader=null;
		try {
		 reader = new FileReader(path);
		 int i;
		 while((i=reader.read())!=-1) {
		
		System.out.print((char)i);
		
		 }
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
	}
}
