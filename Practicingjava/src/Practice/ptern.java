package Practice;

public class ptern {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
		for(int j=1;j<5;j++) {
			if(i==1 ||i==4||j==1||j==4||i==j) {
				System.out.print("*"+" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
		}
	}

}
