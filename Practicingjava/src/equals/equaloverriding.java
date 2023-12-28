package equals;

public class equaloverriding {
String ename;
int eid;
double salary;
equaloverriding(String ename, int eid, double salary){
	this.ename=ename;
	this.eid=eid;
	this.salary=salary;
}
public boolean equals(Object o) {
	equaloverriding e=(equaloverriding)o;
	if(e.salary==this.salary) {
		return true;
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		equaloverriding e1=new equaloverriding("Prateek", 1, 35000);
		equaloverriding e2=new equaloverriding("Arun", 2, 35000);
				System.out.println(e1.equals(e2));
	}
	
}

