package Patterns;

public class p2 {
	public static void main(String[] args) {
		int n=4;
		
	for(int i=n;i>=1;i--) {
		for(int space=i;space<=n-1;space++) {
			System.out.print(" "+" ");
		}
	for(int col=1;col<=2*i-1;col++) {
		System.out.print("*"+" ");
	}
	System.out.println();
}}}



