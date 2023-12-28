package programs;

public class pgm1 {
	public static void main(String[] args) {
		int []arr= {234,654,876,789,927,713,643  };
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			int num1=arr[i]/10;
			num1=num1%10;
			int num2=arr[j]/10;
			num2=num2%10;
			
			if(num1>num2) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
	}
	
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}
}
		

	
