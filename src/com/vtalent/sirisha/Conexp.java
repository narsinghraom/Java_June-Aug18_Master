package com.vtalent.sirisha;

import sun.applet.Main;

public class Conexp {
	int i,j;
	Conexp()
	{
		i=5;j=10;
		
	}
	Conexp(int i)
	{
		this.i=this.i+i;
		j=j+i;
		
	}
	Conexp(int i,int j)
	{
		this.i=this.i+j;
		this.i=this.j+j;
	}
public static void main(String[] args) {
	Conexp ce=new Conexp();
	Conexp ce1=new Conexp(5);
	Conexp ce2=new Conexp(2,3);
	System.out.println(ce.i);
	System.out.println(ce.j);
	System.out.println(ce1.i);
	System.out.println(ce1.j);
	System.out.println(ce2.i);
	System.out.println(ce2.j);
}

}
