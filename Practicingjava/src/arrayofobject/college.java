package arrayofobject;

import java.util.Scanner;

public class college {
	String sname;
	int regno;
	String branch;
	public college(String sname, int regno, String branch) {
		super();
		this.sname = sname;
		this.regno = regno;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "sname=" + sname + ", regno=" + regno + ", branch=" + branch;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		college arr[]=new college[size];
		System.out.println("Enter the details");
		for(int i=0;i<arr.length;i++) {
			sc.nextLine();
			System.out.println("Enter the name");
			String sname=sc.nextLine();
			System.out.println("Enter the regno");
			int regno=sc.nextInt();
			System.out.println("Enter the branch");
			String branch=sc.next();
			arr[i]=new college (sname, regno, branch);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		
		}
	}
	

}
