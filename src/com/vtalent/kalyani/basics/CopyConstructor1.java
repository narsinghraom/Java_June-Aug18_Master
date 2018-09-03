package com.vtalent.kalyani.basics;

public class CopyConstructor1 {
int i, j;
	
	CopyConstructor1()
	{
		
		i=5;
		j=10;
		
	}
	CopyConstructor1(int i)
	{
		this(2,3);
		this.i=this.i+i;
		j=j+1;
		System.out.println("value of j" +j);
		
	}
	CopyConstructor1(int i,int j)
	{
		this();
		System.out.println(i);
		System.out.println(this.i);
		this.i=this.i+i;
		System.out.println(this.i);
		this.j=this.j+j;
		System.out.println(this.j);
	}
	public static void main(String[] args)
	{
		CopyConstructor1 c2=new CopyConstructor1(5);
		System.out.println(c2.i);
		System.out.println(c2.j);
		
		

	}

}
