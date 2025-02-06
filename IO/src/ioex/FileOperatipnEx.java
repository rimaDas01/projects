package ioex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperatipnEx {
	
	public static void write() throws IOException {
		FileWriter fw=new FileWriter("myfile.txt",true); //true is used to write old content along with new content
//		fw.write("\nIndia is my country.");
//		fw.write("\nI love my country");
		//for user input
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		System.out.println("Enter a line: ");
		String line = bfr.readLine();
		
		
		fw.write("\n"+line);
		fw.flush();
		System.out.println("File write operation completed!");
	}
	
	public static void read() throws IOException{
		FileReader fr= new FileReader("myfile.txt");
//		fr.read();
		BufferedReader bfr = new BufferedReader(fr);
		String line;
		while((line=bfr.readLine())!=null)
			System.out.println(line);
	}

	public static void main(String[] args) throws IOException {
//		File file = new File("myfile.txt");
//		FileWriter fw =new FileWriter(file);
		
//		FileWriter fw = new FileWriter("myfile.txt");
//		FileWriter fw = new FileWriter("myfile.txt",true);//true to keep the previous data in the file and not get deleted
//		fw.write("India is my country.");
		
//		fw.write("\nI love my country");
//		System.out.println("File write operation completed!");
//		fw.flush();
		
//		write();
		read();
		
		
		
		

	}
}
