package Upanddowncasting;

public class Driver2 {
public static void main(String[] args) {
	child2 c2=new child2();
	System.out.println(c2.a);
	System.out.println(c2.b);
	System.out.println(c2.c);
	child1 c1=c2;
	child2 c3=(child2)c1;
	System.out.println(c3.c);
	parent1 p1=new child2();
	child2 c4=(child2)p1;
	System.out.println(c4.c);
	System.out.println(c4.b);
}}
