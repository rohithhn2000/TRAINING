package Multipleinheritence;

public class child2 extends child1{
	
int c;
public static void main(String[] args) {
	child2 c2=new child2();
	System.out.println(c2.a);
	System.out.println(c2.b);
	System.out.println(c2.c);
	child1 c1=new child1();
	System.out.println(c1.a);
	System.out.println(c1.b);
	//System.out.println(c1.c);
	parent p1=new parent();
	System.out.println(p1.a);
	//System.out.println(p1.b);
	//System.out.println(p1.c);
	
}
}
                                                                                                                                                                 