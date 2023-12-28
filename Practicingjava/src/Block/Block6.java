package Block;

public class Block6 {
	static {System.out.println("SIB-1");
		}
	static {
		System.out.println("SiB-2");
		}
	public Block6()
	{
		System.out.println("Const1");
	}
	{
		System.out.println("II-1");
	}
	{
		System.out.println("IIB-2");
	}
	public Block6(int a) {
		System.out.println("COnst2");
	}
	public static void main(String[] args) {
		
		Block6 b1=new Block6();
		System.out.println("main method");
		Block6 b2=new Block6(10);
		
	}
}
