package toString;

import java.util.Objects;

public class school {
	String sname;
	int rollno;
	double per;
	int std;
	public school(String sname, int rollno, double per, int std) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.per = per;
		this.std = std;
	}
	public String toString() {
		return "school [sname=" + sname + ", rollno=" + rollno + ", per=" + per + ", std=" + std + "]";
	}
	
	
	@Override
	public boolean equals(Object o) {
		school s=(school)o;
		if (s.per==this.per && s.sname.equals(this.sname)) {
			return true;
		}else {
			return false;
		}
}
		public static void main(String[] args) {
			school s1= new school("Anish",4,98.5,8);
			school s2= new school("Anish",4,98.5,9);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s1.equals(s2));
			school s3= new school("Ah",9,8.75,8);
			System.out.println(s2.equals(s3));
		}
	}
