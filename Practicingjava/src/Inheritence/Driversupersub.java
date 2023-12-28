package Inheritence;

public class Driversupersub {
public static void main(String[] args) {
	Subclass S1=new Subclass();
	S1.a=10;
	S1.b=40.7;
	S1.f=37.9f;
	S1.ch='D';
	Superclass S2=new Superclass();
	S2.a=90;
	S2.b=50.9;
	
	System.out.println(S1.a+" "+S1.b+" "+S1.f+" "+S1.ch);
	System.out.println(S2.a+" "+S2.b);
}
}
