package singleinheritence;

public class child extends parent {
	int c;
	int d;
public static void main(String[] args) {
	child c1=new child();
	System.out.println(c1.a);
	System.out.println(c1.b);
	System.out.println(c1.c);
	System.out.println(c1.d);
parent p1= new parent();
System.out.println(p1.a);
System.out.println(p1.b);
//System.out.println(p1.c);
//System.out.println(p1.d);
}
}
