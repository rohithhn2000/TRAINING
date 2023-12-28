package Block;

public class SIB_2 {
	static int a=10;
	static {
		int a=20;
		SIB_2.a=30;
		System.out.println(a);
	}
	
public static void main(String[] args) {
	System.out.println(a);
}
}
