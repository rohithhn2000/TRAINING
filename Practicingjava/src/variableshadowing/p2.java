package variableshadowing;

public class p2 extends p1{
	int i=30;
	static int b=40;
	public static void main(String[] args) {
		p1 d1=new p1();
		System.out.println(d1.a);
		System.out.println(d1.b);
		p2 c1=new p2();
		System.out.println(c1.a);
		System.out.println(c1.b);
		d1=c1;
		System.out.println(d1.a);
		System.out.println(d1.b);
		p2 c2=(p2)d1;
		System.out.println(c2.a);
		System.out.println(c2.b);
	}
	

}
