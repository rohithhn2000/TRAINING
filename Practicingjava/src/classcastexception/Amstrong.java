package classcastexception;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		int temp=num;
		int count=0;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		int temp1=num;
		int arm=0;
				while(temp1 !=0) {
					int rem=temp1%10;
					int pow=1;
					for(int i=1;i<=count;i++) {
						pow=pow*rem;
				}
				arm=arm+pow;
				temp1=temp1/10;
				} 
	if(arm==num) {
		System.out.println("Armstrong number");}
		else {
			System.out.println("Not armstrong number");
			
		}*/
		String s1="I live in bn";
String arr[]=s1.split(" ");
String s2=" ";
		for(int i=arr.length-1;i>=0;i--) {
			s2=s2+arr[i]+" ";
		}
			System.out.println(s2);
		
	}}