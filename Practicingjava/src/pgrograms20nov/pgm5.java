package pgrograms20nov;

import java.util.Collections;
import java.util.LinkedList;

public class pgm5 implements Comparable {
int id;
String name;
int std;
char c;
double per;

	
	
	
public pgm5(int id, String name, int std, char c, double per) {
	
	this.id = id;
	this.name = name;
	this.std = std;
	this.c = c;
	this.per = per;
}


@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", std=" + std + ", c=" + c + ", per=" + per ;
}

public int compareTo(Object o) {
	pgm5 p=(pgm5)o;
	if(this.per==p.per) {
		return 0;
	}
	else if (this.per>p.per) {
		return 1;
	}
	else {
	return -1;
	}
	
}
	
	public static void main(String[] args) {
	LinkedList<pgm5>	data=new LinkedList();
	data.add(new pgm5(1,"Rohith", 4,'A',45.5));
	data.add(new pgm5(2,"ith", 4,'A',42.5));
	data.add(new pgm5(7,"ohith", 4,'A',95.5));
	System.out.println(data);
	Collections.sort(data);
	System.out.println("Aftersorting");
	for(pgm5 p:data) {
		System.out.println(p);
	}
	
	}

}
