package Interface;

public class child  implements I5 {
		public void m1() {
			System.out.println("Method-1");
		}
		public void m2() {
			System.out.println("method-2");
		}
		public static void main(String[] args) {
			I5 i=new child();
			i.m1();
			i.m2();
		}
}


