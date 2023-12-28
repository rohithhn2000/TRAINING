package toString;

public class emp {
	String ename;
	int eid;
	double salary;
	emp(String ename, int eid, double sal){
		this.ename=ename;
		this.eid=eid;
		this.salary=salary;
	}
public static void main(String[] args) {
	emp e1=new emp("Akash",1,30000000);
	System.out.println(e1);
}
}
