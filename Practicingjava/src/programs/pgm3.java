package programs;

public class pgm3 {
	static int count=10;
	public static void main(String[] args) {
		reverse(30);
		
	}
	public static void reverse(int num) {
		if(count!=0) {
			System.out.println(num);
			count--;
			reverse(num-1);
			
		}
		
	
		
	}
	

}


