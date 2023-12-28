package Exception;

public class e2 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3/0);
		}catch (ArithmeticException e) {
			System.out.println("Exception tension beda guru;");
		}
		System.out.println(3);
	}
}
