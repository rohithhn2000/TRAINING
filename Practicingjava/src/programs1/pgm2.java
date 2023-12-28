package programs1;

public class pgm2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j || i+j==n+1) {
					System.out.print("X"+" ");
				}
				

				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
