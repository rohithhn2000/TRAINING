package Polymorphism;

public class Demo {
	public static void method(int a) {
		System.out.println("Method-1");
	}
	public static void method(int a, int b) {
		System.out.println("Method-2");
	}
public static void main(String[] args) {
	method(10);
	method(10,20);
}
}
