package programs;

import java.util.*;


public class pgm2 {
	public static void main(String[] args) {
	ArrayList arr=new ArrayList();
	String s1="sADF23HKJ56DR65LOI67fyjfsu8979jhjfy89hdhd67jdjdjd32hdjd90";
	char[] s2=s1.toCharArray();
	String num="0";
	for(int i=0;i<s2.length;i++) 
	{
		if(s2[i]>='0' && s2[i]<='9') {
			num=num+s2[i];
			
		}
		else {
			if(Integer.parseInt(num)!=0) {
				arr.add(Integer.parseInt(num));
				num="0";
			}
			
		}}
	
	System.out.println(arr);
	System.out.println("After sorting");
	Collections.sort(arr);
	System.out.println(arr);	
	}}
