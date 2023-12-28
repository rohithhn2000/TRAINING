package arrayofobject;

import equals.emp;

public class p1 {
		String ename;
		int eid;
		double salary;
		p1(String ename, int eid, double salary){
			this.ename=ename;
			this.eid=eid;
			this.salary=salary;
		}
		public String toString() {
			return ("ename :"+this.ename+"eid :"+this.eid+"salary:"+this.salary);
		}
		public static void main(String[] args) {
			p1 e1=new p1("Rani", 1,35000);
			p1 e2=new p1("Raja",2, 56989);
			p1 arr[]=new p1[2];
			arr[0]=e1;
			arr[1]=e2;
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}

	}


}
