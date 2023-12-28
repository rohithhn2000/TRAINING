package Block;

import java.util.Scanner;

public class sortthearray {
public static int[] sortarray(int b[])
{
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]>b[j]) 
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	return b;
	}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=sc.nextInt();
	int arr[]=new int [size];
	System.out.println("Enter the elements of an array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int result[]=sortarray(arr);
	int count=0;
	for(int i=0;i<result.length;i++)
	{
		for(int j=i+1;j<result.length;j++)
		{
			if(result[i]==result[j])
			{
				count++;
			}
		}
	}
							int b[]=new int[result.length-count];
							int k=0;
							for(int i=0;i<result.length-1;i++) 
							{
								if(result[i]!=result[i+1])
								{
									b[k]=result[i];
									k++;
								}
							}
							b[k]=result[result.length-1];
							for(int i=0;i<b.length;i++)
							{
								System.out.println(b[i]+" ");
							}
}
}
