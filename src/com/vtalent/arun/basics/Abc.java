package com.vtalent.arun.basics;

public class Abc {
	int a,b,x;
	float y,z,k;
	public void methodOne(int a,int b)
	{
	this.a=a+b;
	this.b=this.a+a;
	System.out.println(this.a+this.b+a+b);
	}
	public float methodTwo(int x,float y,float z)
	{
		this.y=y+z;
		this.x=(int) ((int)this.y+z);
		return k=this.y+z;
	}
	public Abc()
	{
		System.out.println("This is a constructor");
	}

	public static void main(String[] args) {
	Abc d=new Abc();
	d.methodOne(5,6);
	d.methodTwo(3,2.5f,3.2f);
	System.out.println(d.k);

	}

}
