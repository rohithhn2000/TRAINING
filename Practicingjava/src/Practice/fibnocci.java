package Practice;

public class fibnocci { 
	public static void main(String[] args) {
		int fib1=1;
		int fib2=2;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=2;i<=8;i++) {
		int fib3=fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		System.out.println(fib3);
		
		
		}
	}

}
