package toString;

public class Empl extends Object{
String ename;
int eid;
double salary;
public Empl(String ename, int eid, double salary) {
	super();
	this.ename=ename;
	this.eid=eid;
	this.salary=salary;
}
public String toString() {
	return"Employee name:"+this.ename+"Eid:"+this.eid+" "+"Salary:"+this.salary;
}
public static void main(String[] args) {
	Empl e1=new Empl("Akash", 1,   2000);
	System.out.println(e1.toString());
	Empl e2=new Empl("Aditya", 1, 20000);
	System.out.println(e2.toString());
}
}

