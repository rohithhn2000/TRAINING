package pgrograms20nov;

public class pgm1 {
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			int num=1;
			char ch='A';
			for(int j=1;j<=6;j++) {
				if(i>j) {
					System.out.print(num+" ");
					num++;
					}
				
			 if (i==j) {
					System.out.print("@"+" ");
				}
			 if(i<j) {
				System.out.print(ch+" ");
				ch++;
				
			}
				
				
				
			}
			System.out.println();
		}
	}
}
