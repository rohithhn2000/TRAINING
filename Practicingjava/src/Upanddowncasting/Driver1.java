package Upanddowncasting;

public class Driver1 {
	public static void main(String[] args) {
		sub s1=new sub();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.ch);
		System.out.println(s1.d);
		Super s2=s1;
		//System.out.println(s2.ch);
		//System.out.println(s2.d);
		sub s3=(sub)s2;
		System.out.println(s3.ch);
		System.out.println(s3.b);
				
	}

}
