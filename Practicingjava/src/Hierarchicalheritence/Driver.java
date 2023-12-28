package Hierarchicalheritence;

public class Driver {
public static void main(String[] args) {
	child1 c1=new child1();
	System.out.println(c1.a);
	System.out.println(c1.b);
	//System.out.println(c1.c);
	child2 c2=new child2();
	System.out.println(c2.a);
	//System.out.println(c2.b);
	System.out.println(c2.c);
	parent p1=new parent();
	System.out.println(p1.a);
	//System.out.println(p2.b);
	//System.out.println(p2.c);
}
}
