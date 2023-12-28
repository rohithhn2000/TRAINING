package Methodshadowing;

public class Driver {
	public static void main(String[] args) {
		parent p1=new parent();
	//	p1.method();
		child c1=new child();
		c1.method();
		p1=c1;
	//	p1.method();
	}
}