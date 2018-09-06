package com.vtalent.arun.basics;
class First {
	int i,j;
	public void function(int i)
	{
		this.i=i+i;
		j=i;
	}
}
class Second extends First{
	int i,j;
	public void function(int i,int j){
		this.j=j+i;
		super.i=super.i+i;
	}
}
class Third extends Second {
	int i,j;
	public void function(int i,int j){
		this.i=i+j;
		super.i=super.i+this.i;
	}
}
public class TestInheritEx {
public static void main(String[] args) {
	First f=new First();
	f.function(2);
	System.out.println(f.i);
	System.out.println(f.j);
	Second s=new Second();
	s.function(2);
	s.function(2,5);
	System.out.println(s.i);
	System.out.println(s.j);
	Third t=new Third();
	t.function(6);
	t.function(5,6);
	System.out.println(t.i);
	System.out.println(t.j);
	
}
}
