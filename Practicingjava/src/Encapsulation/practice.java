package Encapsulation;

public class practice {
	private double balance;
	private int pin=1234;

	public practice(double balance, int pin) {
		super();
		this.balance = balance;
		this.pin=pin;
	}
	
	public double getbalance() {
		return this.balance;
	}
	public String getbalance (int pin) {
		if(this.pin == pin)
		return "balance"+balance;
		else
			return "invalid pin";}
		//Setters with validation ====deposit
		public void deposit(int depositAmnt)
			{
			if(depositAmnt>0)
			{
				this.balance+= depositAmnt;
				System.out.println("deposited succesfully");
				
			}
			
			else 
				System.out.println("Deposit should be greater than zero");
		}
		public void withdrawal (int pin, int withdrawal) {
			
			if(this.pin==pin) {
				if(withdrawal<= balance && withdrawal >0) {
					this.balance -= withdrawal;
					System.out.println("Withdrawn");
				}
				else System.out.println("AMnt entered cant be withdrawn");
			}
			else 
				System.out.println("pin invalid");
		
	}

}
