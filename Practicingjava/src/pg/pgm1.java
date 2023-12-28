package pg;

public class pgm1 {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int [] arr2= {5,6,7,8};
		int [] temp=new int [arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			temp[k]=arr1[i];
			k++;
		}
		if(k>arr1.length-1)
		for(int j=arr2.length-1;j>=0;j--) {
			temp[k]=arr2[j];
			k++;
		}
		int n=2;
		for(int m=0;m<n;m++) {
		int last=temp[temp.length-1];
		for(int i=temp.length-1;i>0;i++) {
			temp[i]=temp[i-1];
		}
		temp[0]=last;
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}
}

