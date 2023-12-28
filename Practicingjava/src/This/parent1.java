package This;

public class parent1 {
	parent1(int a ){
		this(a,20.5);
		System.out.println("Const-1");
	}
parent1(int a, double b){
	this();
	System.out.println("Const -2");
	}
parent1(){
	System.out.println("Const - 3");
}
}
