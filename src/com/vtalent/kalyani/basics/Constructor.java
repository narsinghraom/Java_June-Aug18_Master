package com.vtalent.kalyani.basics;

public class Constructor {
	int i, j;
	Constructor()
	{
		i=5;
		j=10;
		
	}
	Constructor(int i)
	{
		this.i=this.i+i;
		j=j+i;
		
	}
	Constructor(int i,int j)
	{
		this.i=this.i+i;
		this.j=this.j+j;
	}
	public static void main(String[] args)
	{
		
		Constructor ce=new Constructor();
		Constructor c1= new Constructor(5);
		Constructor  c2= new Constructor(2, 3);
		System.out.println(ce.i);
		System.out.println(ce.j);
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c2.i);
		System.out.println(c2.j);


	}

}
