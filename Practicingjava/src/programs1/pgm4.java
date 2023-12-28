package programs1;

public class pgm4 {
	public static void main(String[] args) {
		String s1="AAAAbbbbbcccDDDDeeeeFFFgggg";
		char [] arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>='A' && arr[i]<='Z') {
			arr[i]=(char) (arr[i]+32);
		}
		else {
			arr[i]=(char)(arr[i]-32);
		}
		}
		String s3="";
		for(int i=0;i<arr.length;i++) {
			s3=s3+arr[i];
		}
		System.out.println(s3);
		
			
			
		
		
	
	}
}
