package Exception;

public class e3 {
public static void main(String[] args) {
	try {
		System.out.println(1);
		System.out.println(2);
		System.out.println(2/0);
		System.out.println(4);
		System.out.println(5);
	}catch( Exception e) {
		e.printStackTrace();
	}
	System.out.println(6);
	System.out.println(7);
}
}
