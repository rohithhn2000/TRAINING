package String;

public class P5 {
public static void main(String[] args) {
	String s1="RAMA";
	for(int i=0;i<s1.length();i++) {
		System.out.println(s1.charAt(i));
	}
	
	char arr[]=s1.toCharArray();
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
}
}
