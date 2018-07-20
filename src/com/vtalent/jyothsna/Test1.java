package com.vtalent.jyothsna;
class First {
int i,j;
public void function(int i) {
	this.i=this.i+i;
	j=i*i;
	}
}
class Second extends First{
	int i;
	public Object function;
	public void function(int i,int j) {
		this.i=i+j;
		this.j=i+j+this.j;
		}
	}
class Test1{
	public static void main(String[] arg) {
		First F=new First();
		F.function(2);
		System.out.println(F.i);
		System.out.println(F.j);
		Second S=new Second();
		S.function(3);
		S.function(F.i,F.j);
		System.out.println(S.i);
	System.out.println(S.j);
	}
	
}
