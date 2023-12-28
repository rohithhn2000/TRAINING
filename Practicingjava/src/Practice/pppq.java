package Practice;

import java.util.Scanner;

public class pppq {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(("Enter the number"));
		int num=sc.nextInt();
		int temp=num;
		int count =0;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		int temp1=num;
		int arm=0;
		
		while(temp1!=0) {
			int res=temp1%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod=prod*res;
			}
		
		
			arm=arm+prod;
			temp1=temp1/10;
		}
							
			
		if(arm==num) {
			System.out.println("It is a amstrong number");
			
		}
		else {
			System.out.println("Its not a smstrong number");
		}
		}
	}
	

