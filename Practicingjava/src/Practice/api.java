package Practice;

public class api {
	public static void main(String[] args) {
		
	/*String s1="I Love Selenium";
	String arr[]=s1.split(" ");
	String res=" ";
	for(int i=arr.length-1;i>=0;i--) {
		for(int j=arr[i].length()-1;j>=0;j--) {
	res=res+arr[i].charAt(j);	
	}
	res=res+" ";
	}
	res=res.trim();
System.out.println(res);*/
		int n=6;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if((j==1)||(j==i)||j==n) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
				
		}
			System.out.println();
}
}
}