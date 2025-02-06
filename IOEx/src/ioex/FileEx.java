package ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("myfile.txt");
//		file.createNewFile();
//		System.out.println(file.exists());
//		System.out.println(file.getName());
//		FileOutputStream fos= new FileOutputStream(file,true);
//		fos.write("\nPolo is over".getBytes());
//		fos.flush();
//		System.out.println("Write completedddd");
		
//		if(file.exists()){
//			FileInputStream fis = new FileInputStream(file);
//			fis.read();
//			System.out.println("Read :");
//			int i=0;

//			while((i=fis.read())!=-1)
//				System.out.print((char)i);
//		}
//		else
//			file.createNewFile();
		
		 FileInputStream fis=new FileInputStream("myfile.txt");
	        int i=0;
	        while((i=fis.read())!=-1)
	            System.out.print((char)i);
		
		
	}

}
