package array2d;


import java.util.Scanner;

public class Strong{
	
	public static void main(String[] args) {
	int num=145;
	int temp=num;
	
	int strong=0;
	while(num!=0) {
		int rem=num%10;
		int fact=1;
		for(int i=1;i<=rem;i++) {
			
			fact =fact*i;
		}
		strong+=fact;
		num=num/10;
	}
	
	if(strong==temp) {
		System.out.println("Strong number");
	}
	else {
		System.out.println("Not strong number");
	}
	}
}
