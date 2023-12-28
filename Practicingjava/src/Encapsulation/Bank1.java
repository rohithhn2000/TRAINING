package Encapsulation;

public class Bank1 {
	public static void main(String[] args) {
		Bank b1=new Bank("Felcia", 200000.0, "ROH200", 5000);
		System.out.println(b1.getcustomerName());
		b1.SetcustomerName("Amma Kutty");
		System.out.println(b1.getcustomerName());
		System.out.println(b1.getbalance());
		System.out.println(b1.getifsc());
	}

}
