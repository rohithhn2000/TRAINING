package pgrograms2;

public class pgm1 {
	public static void circle(int r) {
		double area=3.14*r*r;
		double peri=2*3.14*r;
		System.out.println("Area of circle is :"+area);
		System.out.println("Perimeter of circle is :"+peri);
	}
	public static void square(int a) {
		double area=a*a;
		double peri=4*a;
	System.out.println("Area of square is :"+area);
	System.out.println("Perimeter of square is :"+peri);
	}
	public static void triangle(int p,int m,int n, int h) {
		double area=0.5*m*h;
		double peri=p+m+n;
		System.out.println("Area of triangle is :"+area);
		System.out.println("Perimeter of circle is :"+peri);
	
	;
	}
	public static void main(String[] args) {
		circle(3);
		square(5);
		triangle(3,4,5,6);
	}
	
		// TODO Auto-generated method stub
		
	}
	

