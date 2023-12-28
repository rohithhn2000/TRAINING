package HASHCODE;

import java.util.Objects;

public class emp {
	String ename;
	int eid;
	double salary;
	public emp(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	public static void main(String[] args) {
		emp e1=new emp("ANjali",12,45555);
		emp e2=new emp("Ganchali", 15,456666);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		emp e3=e2;
		System.out.println(e3.equals(e2));
		System.out.println(e3.hashCode());
		System.out.println(e2.hashCode());
		
	}
}
