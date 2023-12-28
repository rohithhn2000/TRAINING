package Constructorchaining;

public class child3 extends parent3 {
	child3( ){
		super(10);
		System.out.println("Const -4");
	}
	child3(int a){
		super(a, 20.5);
		
			System.out.println("Const 5");
		}
		child3(int a, double b){
			System.out.println("COnstr 6");
		}
	public static void main(String[] args) {
		child3 c1=new child3();
		child3 c2=new child3(10);
		child3 c3=new child3(10, 20.5);
	}

}