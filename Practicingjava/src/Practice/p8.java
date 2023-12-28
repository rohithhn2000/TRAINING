package Practice;

public class p8 {
	public static void main(String[] args) {
		String s1="2Novemeber2023";
		char arr[]=s1.toCharArray();
		String s2="";
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>='0'&&arr[i]<='9')
			s2=s2+arr[i];
			}
		int m=Integer.parseInt(s2);
		while(m!=0) {
			int res= m%10;
			sum=sum+res;
			m=m/10;
					}
		System.out.println(sum);
	}

}
