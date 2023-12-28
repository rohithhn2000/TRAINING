package pgrograms20nov;

public class pattern1 {
	public static void main(String[] args) {
		int j, num=1;
		
		for(int i=1;i<=5;i++) {
			
			
			for( j=1;j<=5-i;j++) {
				
					System.out.print(" ");
			}
			char ch='A';
				for( j=1;j<=i;j++) {
					if(i%2!=0)
					{
						System.out.print(num+++" ");
					
					}
					else {
						System.out.print(ch+" ");
						ch++;
				}
		}
							
			System.out.println();
		}
	}
}
	

