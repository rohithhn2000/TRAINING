package Methodoverriding;

public class Driver1 {
	public static void main(String[] args) {
		parent p1=new parent();
		p1.method();
		child1 c1=new child1();
		c1.method();
		p1.method();
		p1=c1;
		parent p3=new child2();
		p3.method();
		}

}
