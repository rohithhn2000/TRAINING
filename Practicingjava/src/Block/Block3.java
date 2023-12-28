package Block;

public class Block3 {
	int a=10;
	{
		int a=20;
		a=30;
		System.out.println(this.a);
	}
	{
		a=40;
	}
	public static void main(String[] args) {
		Block3 b1=new Block3();
	System.out.println(b1.a);
	}
}
