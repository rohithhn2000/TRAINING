package equals;

public class emp {
	String ename;
	int eid;
	double salary;
	emp(String ename, int eid, double salary){
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
	public static void main(String[] args) {
		emp e1=new emp("Rani", 1,35000);
		emp e2=new emp("Raja",2, 56989);
		System.out.println(e1.equals(e2));
		emp e3=e2;
		System.out.println(e2.equals(e3));
	}

}
