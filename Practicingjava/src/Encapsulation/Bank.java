                                                                                                                                                                                   package Encapsulation;

public class Bank {
	private String customerName;
	private double balance;
	private String ifsc;
	private long accountno;
	
	public Bank(String customerName, double balance, String ifsc, long accountno) {
		super();
		this.customerName = customerName;
		this.balance = balance;
		this.ifsc = ifsc;
		this.accountno = accountno;
	}
		public String getcustomerName() {
			return this.customerName;
		}
		public void SetcustomerName(String customerName) {
			this.customerName=customerName;
		}
	public double getbalance() {
		return this.balance;
	}
public String getifsc() {
	return this.ifsc;
}
}
