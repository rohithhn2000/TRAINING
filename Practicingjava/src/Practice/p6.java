package Practice;

public class p6 {
public static void main(String[] args) {
	int n=4;
	int m=4;
	char ch='A';
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=m;j++) {
			
				if(i==j) {
					System.out.print(ch+" ");
					ch++;
				}
				else {
					System.out.print(i+j+ " ");
				
				
			}
			
		}
		System.out.println();
	}
}


}
