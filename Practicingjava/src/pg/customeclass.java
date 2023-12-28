package pg;

public class customeclass {
public static void main(String[] args)  {
	int age=61;
	if(age>60) {
		
		throw new customemethod("EXCEPTION");
		
	} 
	else {
		System.out.println("HAi");
	}
}
}
