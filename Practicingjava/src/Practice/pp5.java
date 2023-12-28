package Practice;

import java.util.Scanner;

public class pp5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		
			
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		if(arr[i]>max) {
			max=arr[i];}}
			System.out.println(max);
		
		
		
		
			
		}
		
				
	}

