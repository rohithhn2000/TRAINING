package Practice;

public class pp3 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,1,2,56,89,65};
		int []temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp1=arr[i];
					arr[i]=arr[j];
					arr[j]=temp1;}
				}
					
				System.out.print(arr[i]+" ");}
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]!=arr[j] ){
							temp[j++]=arr[i];
							
						}
						temp[j++]=arr[arr.length-1];
						for(int k=0;k<k;k++)
						System.out.println(temp[k]);
						
						
					}
				}
	}
}
				
		
		

	

