package com.vtalent.dvhprasad.basicjava;

class First{
	int i,j;
	public void function(int i){
	this.i=i+i;
	j=i;
}
}
class Second extends First{
	int i,j;
	public void function(int i,int j){
		this.j=j+i;
		super.i= super.i+i;
	}
}
class Third extends Second{
	int i,j;
	public void function(int i,int j){
		this.i=i+j;
		super.i=super.i+this.i;
	}
}
public class Inheritance {
public static void main(String[] args) {
	First f=new First();
	f.function(2);
	System.out.println(f.i);
	System.out.println(f.j);
	Second s=new Second();
	s.function(5);
	s.function(5,2);
	System.out.println(s.j);
	System.out.println(s.i);
	Third t=new Third();
	t.function(5);
	t.function(5,7);
	System.out.println(t.i);
	System.out.println(t.j);
}

}
