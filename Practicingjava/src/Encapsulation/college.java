package Encapsulation;

public class college {
	private String sname;
	private int sem;
	private int no_ofbacklog;
	private String branch;
	private int regd;
	public college(String sname, int sem, int no_ofbacklog, String branch, int regd) {
		super();
		this.sname = sname;
		this.sem = sem;
		this.no_ofbacklog = no_ofbacklog;
		this.branch = branch;
		this.regd = regd;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getNo_ofbacklog() {
		return no_ofbacklog;
	}
	public void setNo_ofbacklog(int no_ofbacklog) {
		this.no_ofbacklog = no_ofbacklog;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getRegd() {
		return regd;
	}
	public void setRegd(int regd) {
		this.regd = regd;
	}
	@Override
	public String toString() {
		return "Student name is" + getSname() + ", Sem()=" + getSem() + ", No_ofbacklog()="
				+ getNo_ofbacklog() + ", Branch()=" + getBranch() + ", Regd()=" + getRegd();
		}
	
	

}
