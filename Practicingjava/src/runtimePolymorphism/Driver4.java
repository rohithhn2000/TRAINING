package runtimePolymorphism;

public class Driver4 {
	public static void main(String[] args) {
		creditcard c1=new creditcard();
		swipe s1=new swipe();
		s1.swippingmachine(c1);
		debitcard d1=new debitcard();
		s1.swippingmachine(d1);
		card c2=new card();
		s1.swippingmachine(c2);
		
		
	}

}
