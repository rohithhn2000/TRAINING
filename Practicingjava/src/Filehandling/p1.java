package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class p1 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		

		File file=new File("C://Users\\ROHITH\\Desktop\\October Java//Sample.txt");
		if (!file.exists()) {
			System.out.println("file is created");
			file.createNewFile();
		}
		else {
			System.out.println("File is already exixts");
		}
		System.out.println("Enter the Lines");
		FileOutputStream fos=new FileOutputStream(file);
		String s1=sc.nextLine();
		fos.write(s1.getBytes());
		/*String s2="I am from kolar";
		fos.write(s2.getBytes());*/
		
	
		
		FileInputStream fis= new FileInputStream(file);
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
	}
}