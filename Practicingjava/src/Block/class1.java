package Block;

public class class1 {
int a=10;
static double b=20.9;
} 
class class2{
	public static void main(String[] args) {
		class1 c1=new class1();
		System.out.println(c1.a);
		System.out.println(class1.b);
		class1.b=40.8;
		System.out.println(class1.b);
	}
}