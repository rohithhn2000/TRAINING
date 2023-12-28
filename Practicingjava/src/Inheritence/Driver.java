package Inheritence;

public class Driver {
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.a=10;
		p1.b=50.4;
		p1.c=80;
		System.out.println(p1.a+" "+p1.b+" "+p1.c);
		Child c1=new Child();
		c1.a=80;
		c1.b=45.2;
		c1.c=55556;
	}

}
