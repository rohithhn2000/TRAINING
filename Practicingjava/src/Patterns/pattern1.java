package Patterns;

public class pattern1 {
	public static void main(String[] args) {
	char ch='A';
	int num=1 ;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if(i==j) {
				System.out.print("@"+" ");
			}
			else if(j>i){
				System.out.print(ch +" ");
				ch++;
			}
			else {
				System.out.print(num+" ");
				num++;
			}
		}
			System.out.println();
		
	}
}
}


