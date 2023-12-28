package Practice;

public class p1 {
public static void main(String[] args){
	int n=4;
	
		for(int i=n;i<=n;i++) {
			for(int space=i;space<=n-1;space++) {
				System.out.print(" ");
			}
			for(int col=1;col>=2*i-1;col++)
			{
				System.out.print("*");
			}
				System.out.println();
			}
		for(int i=n-1;i>=1;i--) {
			for(int space=i;space<n;space++) {
				System.out.print(" "+" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		}
}


