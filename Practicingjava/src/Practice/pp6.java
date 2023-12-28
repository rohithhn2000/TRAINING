package Practice;

import java.util.Scanner;

public class pp6 {
	public static int prod(int b[]) {
		int prod=1;
		for(int i=0;i<b.length;i++) {
			prod=prod*b[i];
		}
		return prod;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();}
		System.out.println(prod(arr)); 
		
		
		}
		
	}	
	

