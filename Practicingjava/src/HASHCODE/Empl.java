package HASHCODE;

import java.util.Objects;

public class Empl {
	String ename;
	int eid;
	double salary;
	public Empl(String ename, int eid, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
	}
	public boolean equals(Object o) {
		Empl e=(Empl)o;
		if(e.salary==this.salary && e.eid==this.eid) {
			return true;}
		else {
			return false;
		}}
		public int hashCode()
		{
			return Objects.hash(salary, eid);
		}
	
	public static void main(String[] args) {
		emp e1=new emp("ANjali",12,45555);
		emp e2=new emp("Ganchali", 15,456666);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
