package String;

import java.util.Scanner;

public class p11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two  words");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println("Before swapping");
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After swapping");
		System.out.println("s1 :"+s1);
		System.out.println("S2 : "+s2);;	
	}

	
}
