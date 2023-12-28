package seleniumpackage;

public class palindrome {
	public static void main(String[] args) {
		String s1="MADAM";
		String pali="";
		for(int i=s1.length()-1;i>=0;i--)
		{
		pali=pali+s1.charAt(i);
		}
		System.out.println(pali);
		if(pali.equals(s1)) {
			System.out.println("The Strings is palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
		
		
	}

	}

