package Practice;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the range");
		int num=sc.nextInt();
		
		for(int j=1;j<=num;j++) {
			int count=0;
		for(int i=2;i<j;i++) {
			
				if(j%i==0) {
				count++;
			}
		}
		
				if (count==0) {
					System.out.println(j+"is primenumber");
				}
		
				
		
	}
	}
}}

