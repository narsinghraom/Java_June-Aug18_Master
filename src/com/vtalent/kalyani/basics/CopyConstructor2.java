package com.vtalent.kalyani.basics;

public class CopyConstructor2 {
	int i, j;
	CopyConstructor2()
	{
		i=5;
		j=10;
		
	}
	CopyConstructor2(int i)
	{
		this();
		System.out.println(i);
		System.out.println(j);
		this.i=this.i+i;
		System.out.println(this.i);
		j=j+i;
		System.out.println("value of j" +this.j);
	}
	CopyConstructor2(int i,int j)
	{
		this(5);
		System.out.println("value of i" +i);
		System.out.println("value of j" +j);
		this.i=this.i+i;
		System.out.println(this.i);
		System.out.println("value of j" +this.j );
		this.j=this.j+j;
		System.out.println(this.j);
	}

	public static void main(String[] args) {
		CopyConstructor2 ce=new CopyConstructor2(5, 6);
		System.out.println(ce.i);
		System.out.println(ce.j);

	}

}
