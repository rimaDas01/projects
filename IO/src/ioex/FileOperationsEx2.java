package ioex;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileOperationsEx2 {
	
	public static void write() throws IOException {
		FileOutputStream fos= new FileOutputStream("myfile.txt",true);
		fos.write("India is my country".getBytes());
		fos.write("\n I love my country".getBytes());
		fos.flush();
		System.out.println("File write-operation completed");
	}
	
	public static void read() throws IOException {
		FileInputStream fis=  new FileInputStream("myfile.txt");
		int i;
		while((i=fis.read())!=-1)
			System.out.print((char)i);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		write();
		read();

	}

}
