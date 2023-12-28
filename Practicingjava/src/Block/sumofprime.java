package Block;

import java.util.Scanner;

public class sumofprime {
public static boolean isprime(int num){
	if(num==1) {
		return false;
	}
for(int i=2;i<=num/2;i++) {
	if(num%i==0)
		return false;
	}
{
return true;
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int sum=0;
for(int i=1;i<=num;i++)
{
	if(isprime(i)==true){
		sum=sum+i;
	}
}
System.out.println(sum);
}
}
