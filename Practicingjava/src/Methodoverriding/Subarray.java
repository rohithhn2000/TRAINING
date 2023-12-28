package Methodoverriding;

import java.util.Scanner;

public class Subarray {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the elements");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<j;k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println();
		}
	}
		
	}

}
