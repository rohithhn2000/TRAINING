package Patterns;

public class p7 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) 
	{
		for(int col=1;col<=3;col++) 
		{
			if(col==2) 
			{
				System.out.print(" *"+" ");
				continue;
				}
			else if(col==3)
			{
				System.out.println(i+2);
			}
			else
			{
				System.out.print(i);
			}
		}
			System.out.println();
			
	}
}
}