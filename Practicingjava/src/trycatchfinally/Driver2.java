package trycatchfinally;

import java.util.Scanner;

public class Driver2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if (age>20){
		System.out.println("You can apply for DL");	
		}
		else {
			throw new DlException("You cannot apply for DL");
		}
		
	}

}
