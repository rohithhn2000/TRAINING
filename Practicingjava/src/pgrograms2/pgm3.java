package pgrograms2;

public class pgm3 {
	String vehname;
	int noofwheels;
	String made;
	char fuel;
	public pgm3(String vehname, int noofwheels, String made, char fuel) {
		
		this.vehname = vehname;
		this.noofwheels = noofwheels;
		this.made = made;
		this.fuel = fuel;
	}
	
	public String toString() {
		return "vehicle name is=" + vehname + ", no of wheels =" + noofwheels + ", made=" + made + ", fuel=" + fuel ;
	}
	public static void main(String[] args) {
		pgm3 s1=new pgm3("Audi s3", 4, "Audi", 'P');
		pgm3 s2=new pgm3("Auto", 3, "Piaggio", 'C');
		pgm3 s3=new pgm3("Eicher d", 4, "Eicher", 'D');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	
	

}
