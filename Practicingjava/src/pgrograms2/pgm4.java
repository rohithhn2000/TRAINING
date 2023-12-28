package pgrograms2;

public class pgm4 {
	public static void main(String[] args) {
		int [] arr1= {1,2,3,4};
		int [] arr2= {5,6,7,8};
	int[] temp1 = new int[arr1.length+arr2.length];
	int k=0;
		for(int j=0;j<arr1.length;j++) 
		{
			temp1[k]=arr1[j];
			k++;
		}
		if(k>arr1.length-1)
		for(int i=arr2.length-1;i>=0;i--)
		{
			temp1[k]=arr2[i];
			k++;
			
		}
		for(int i=0;i<temp1.length;i++)
		{
			System.out.print(temp1[i]+" ");
		}
	}
}

	
		
		       	
	

