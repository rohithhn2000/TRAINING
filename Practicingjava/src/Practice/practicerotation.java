package Practice;

import java.util.Scanner;

public class practicerotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int n=3;
		
		for(int i=0;i<n;i++) {
			int last=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
