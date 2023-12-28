package Abstraction;

public class child extends Parent {
	public void method1() {
	System.out.println("method-2");
}
public static void main(String[] args) {
	child c1=new child();
	c1.method1();
	Parent p1=c1;
	p1.method1();
	
}

}
