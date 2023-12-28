package Practice;

public class pgm1 {
	
		public static void main(String[] args){
		int arr[]={12,98,45,23,74,56,87};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
				
			}		
		}	
			}
		
		

