package arrayofobject;


public class School {
		String ename;
		int eid;
		double Clas;
		public School(String ename, int eid, double Clas){
			this.ename=ename;
			this.eid=eid;
			this.Clas=Clas;
		}
		public String toString()
		{
			return "Student name:"+this.ename+"Rollno "+this.eid+"class"+this.Clas;
			}
		public static void main(String[] args) {
			School arr[]= {new School("Rani", 1,35000),
							new School("Ranis", 1,35000),
							new School("Rahhni", 1,35000)};
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
}

	