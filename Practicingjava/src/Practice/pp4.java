package Practice;

public class pp4 {
	public int product(int num, int power) {
		int prod=1;
		for(int i=1;i<=power;i++) 
			prod=prod*num;
	return prod;
	}
		
	
public static void main(String[] args) {
	pp4 a1=new pp4();
	System.out.println(a1.product(5,2));
	
	
	
	
	
}
}
