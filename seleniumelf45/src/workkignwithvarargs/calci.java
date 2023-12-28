package workkignwithvarargs;

public class calci {
	public static int sub(int...ref) {
		int minus=0;
		for(int a:ref) {
			minus=minus-a;
		}
		
		return minus;
	}
	

}
