package toString;

public class Student {
	String Sname;
	int std;
	int sid;
	public Student(String sname, int std, int sid) {
		super();
		Sname = sname;
		this.std = std;
		this.sid = sid;
	}
	public String toString() {
		return "Student name is"+this.Sname+" "+"Std "+this.std+" "+"Sid is "+this.sid;
	}
	public static void main(String[] args) {
		Student s1=new Student("ANIL", 4, 56);
		System.out.println(s1.toString());
		Student s2=new Student("Anna bella",5, 560);
		System.out.println(s2.toString());
	}
	}


