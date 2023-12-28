package programs1;

public class pgm1 {
	public static boolean strong(int n)
	{
		int sum=0;
		int num=n;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
			
		}
	
		if(temp==sum) 
		{
		return true;
	}
		else {
		return false;
		}

}
	public static void main(String[] args) {
		System.out.println(strong(145));
	}
}
