package String;

public class p6 {
	public static void main(String[] args) {
		String s="ROHITH";
		String rev="";
		char arr[]=s.toCharArray();
		for(int i=arr.length-1;i>0;i--) {
			rev=rev+arr[i];}
		System.out.println(rev);
		
	}

}
