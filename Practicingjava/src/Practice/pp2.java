package Practice;

public class pp2 {
public static void main(String[] args) {
	String s1="NITIN";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);}
	if (s1.contains(s2)) {
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("Its not palindrome");
	}
		
	}
}
