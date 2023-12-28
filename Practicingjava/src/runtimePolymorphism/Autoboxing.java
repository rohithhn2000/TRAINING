package runtimePolymorphism;

public class Autoboxing {
	public static void main(String[] args) {
		int a=10;
		Integer b=a;
		System.out.println(b);
		double d=30.5;
		Double d1=new Double(d);
		System.out.println(d1);
		
		char ch='A';
		Character ch1=ch;
		System.out.println(ch1);
	}

}
