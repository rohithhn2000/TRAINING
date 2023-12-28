package trycatchfinally;

public class p1 {
	public static void main(String[] args) {
		try {
			int arr[]= {0,1,2,3};
			System.out.println(arr[arr.length-1]);
			}catch(Exception e) {
				System.out.println("Exception is handled");
		}finally {
			System.out.println("This is finally block");
		}
	}

}
