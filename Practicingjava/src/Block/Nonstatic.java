package Block;

public class Nonstatic {
	{
	System.out.println("Non static block");
}
public static void main(String[] args) {
	
	System.out.println("main method");
	Nonstatic n1=new Nonstatic();
	
}
}
