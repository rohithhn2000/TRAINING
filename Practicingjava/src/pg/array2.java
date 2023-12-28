package pg;

import java.util.Scanner;
//  WAP to print all characters only once from string 
//String s="javajavajavadevdevdev" Output:-javde
public class array2 {
	public static void main(String []args){
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string");
//		String s=sc.nextLine();
//		String s1=s.trim();
//		System.out.println(s);
		String s="javajavajavadevdevdev";
		String s1="";
		for(int i=0;i<s.length();i++) {
			
			
			if(s.charAt(i)!=s.charAt(i+1)) {
				s1=s1+s.charAt(i);
				char c=s1.charAt(i);
				System.out.println(s1.indexOf(c));
			}
		}
			
		}
		
	
}
		
		
		
	
		



		
