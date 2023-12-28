package This;

public class child extends parent {
	child(int a){
		System.out.println("Const-3");
	}
child(){
	this(10);
	System.out.println("Const -4");
	
}
public static void main(String[] args) {
	child c1=new child();
}
}
