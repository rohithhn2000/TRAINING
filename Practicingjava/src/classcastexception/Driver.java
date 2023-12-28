package classcastexception;

public class Driver{
	public static void main(String[] args) {
		child c1= new child();
		parent p1=new parent();
		child c2=(child) p1;
		System.out.println(c2.c);
				
	}
}
