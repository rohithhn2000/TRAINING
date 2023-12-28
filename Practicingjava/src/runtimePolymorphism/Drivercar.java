package runtimePolymorphism;

public class Drivercar {
	public void noofwheels(Vehicle V) {
		V.noofwheels();
}
public static void main(String[] args) {
	car c1=new car();
	Drivercar d1=new Drivercar();
	d1.noofwheels(c1);
	Auto a1=new Auto();
	d1.noofwheels(a1);
	Vehicle v1=new Vehicle();
	d1.noofwheels(v1);
}
}