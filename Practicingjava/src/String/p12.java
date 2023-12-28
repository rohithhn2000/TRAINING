package String;

import java.util.Scanner;

public class p12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=sc.nextLine();
		String arr[]=s1.split(" ");
		String s2= " ";
		for(int i=0;i<arr.length;i++) {
			if(s2.contains (arr[i])==false) {
				s2=s2+arr[i]+" ";
			}
		}
		System.out.println(s2);
	}
	

}
