package Methodoverriding;

public class Driver {
public static void main(String[] args) {
	Father f1=new Father();
	f1.Light();
	Son s1=new Son();
	s1.Light();
	f1=s1;
	f1.Light();

}
}
