package Constructorchaining;

public class child2 extends parent2 {
child2 (int a){
	super(10);
	System.out.println("Const-2");
	}
public static void main(String[] args) {
	{
		child2 c1=new child2(10);
}
}

}
