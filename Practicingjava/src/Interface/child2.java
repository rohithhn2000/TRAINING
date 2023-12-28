package Interface;

public class child2 implements i1, i2  {
public void m1() {
	System.out.println("Method1");
}
public void m2() {
	System.out.println("Method2");
}
public static void main(String[] args) {
	i1 ii=new child2();
	ii.m1();
	//ii.m2();
	i2 iii=new child2();
	//iii.m1();	
	iii.m2();
	
	
}
}
