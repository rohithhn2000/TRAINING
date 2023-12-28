package Block;

public class this1 {
	this1(){
		this(10);
		System.out.println("Const-1");
	}
	this1(int a){
		System.out.println("Const-2");
		System.out.println(a);
	}
	public static void main(String[] args) {
		this1 c1=new this1();
		
	}

}
