package This;
class child1 extends parent1{
child1(int a){
	this(a, 20.5); 
	{
		System.out.println("Const-4");
	}
}
	child1(int a, double b){
		super(a);
		System.out.println("Const-5");
			}
	child1(){
		this(10);
		System.out.println("Cons-6");
	}
}

