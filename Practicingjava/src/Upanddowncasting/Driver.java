package Upanddowncasting;

public class Driver {
	public static void main(String[] args) {
	Child c1=new Child();
	System.out.println(c1.a);
	System.out.println(c1.b);
	//System.out.println(c1.c);
	//System.out.println(c1.d);
	System.out.println(c1 instanceof Parent);
	System.out.println(c1 instanceof Child);
	Parent p1= new Parent();
	System.out.println(p1.a);
	System.out.println(p1.b);
	//System.out.println(p1.c);
	//System.out.println(p1.d);
	System.out.println(p1 instanceof Parent);
	System.out.println(p1 instanceof Child);
	p1=c1;
	//System.out.println(p1.c);
	//System.out.println(p1.d);
	Child c3=(Child)p1;
	System.out.println(c3.c);
	System.out.println(c3.d);
	
	
	}
}
