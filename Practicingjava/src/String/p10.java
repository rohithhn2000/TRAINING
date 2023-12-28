package String;

public class p10 {
	public static void main(String[] args) {
		String s1="I Live in Bangalore";
		String arr[]=s1.split(" ");
		String s2= " ";
		for(int i=arr.length-1;i>=0;i--) {
			s2=s2+arr[i]+" ";                   
		}
		System.out.println(s2);
	}

}
