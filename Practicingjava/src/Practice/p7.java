package Practice;

public class p7 {
	public static void main(String[] args) {
		int n=3;
		int m=3;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				
					if(i==j) {
						System.out.print(ch+"  ");
						ch+=n;
						
					}
					else {
						System.out.print((i+j)*i+"  ");
					
					
				}
				
			}
			System.out.println();
		}
	}



}
