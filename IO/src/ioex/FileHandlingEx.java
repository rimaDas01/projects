package ioex;

import java.io.File;
import java.io.IOException;

public class FileHandlingEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		File file= new File("C:\\Users\\rima.das\\Desktop\\Javawork\\CollectionJava.txt");
		File file = new File("myfile.txt");
		if(file.exists()) {
			System.out.println("File exists");
			file.delete();
			System.out.println("File deleted");
		}
		else {
			System.out.println("File doesnot exist!");
			file.createNewFile();
			System.out.println("New file created!!");
		}
	}

}
