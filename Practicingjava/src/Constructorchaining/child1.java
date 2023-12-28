package Constructorchaining;

public class child1 extends parent1 {
	
child1(){
	System.out.println("Const-3");
}
child1(int a){
	System.out.println("Const-4");
}
public static void main(String[] args) {
	child1 c1=new child1();
	child1 c2=new child1(10);
}
}
