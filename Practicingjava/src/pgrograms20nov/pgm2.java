package pgrograms20nov;

public class pgm2 {
	public static String pro(String s) {
		char temp[]=s.toCharArray();
		String s2="";
		for(int i=0;i<temp.length;i++) {
			
			for(int j=i+1;j<temp.length;j++) {
			if(temp[i]==temp[j]) {
				temp[i]='0';
				temp[j]='0';
			}
			}
				if(temp[i]!='0') {
			
				s2=s2+temp[i];
			}
		}
		
	return s2;
	}
	public static void main(String[] args) {
		System.out.println(pro("Selenium"));
	}

}
