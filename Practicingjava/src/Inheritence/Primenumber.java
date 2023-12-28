package Inheritence;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Prime number");}
		else 
		{
			System.out.println("Composite number");
		}
	}

}
