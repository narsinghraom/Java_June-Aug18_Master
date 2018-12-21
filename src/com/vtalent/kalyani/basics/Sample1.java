package com.vtalent.kalyani.basics;
class A1
{
	int a;
	int b;
	public int m1(int a, int b)
	{
		a=a+b;
		this.a=a+this.a;
		this.b=this.b+this.a+a;
		return this.a+this.b;
	}
	public float m2(int a, int b)
	{
		a=a+b+this.b;
		System.out.println(a);
		this.b=a+this.b;
		System.out.println(this.a);
		System.out.println(this.b);
		return a+this.a;
	}
}
class B extends A1
{
	int a=10;
	int b;
	public int m1(int a, int b, int c)
	{
		super.a=this.a+super.a+a+c;
		this.b=a+super.a+this.b+a;
		return this.b+super.b;
	}
	public int m1(int a, int b)
	{
		this.a=a+this.b+super.a;
		b=this.a+super.a+b;
		return b+a+this.a;
	}
}
public class Sample1 {

	public static void main(String[] args) {
		
		B b=new B();
		int b1=b.m1(10,20);
		int a=b.m1(5,6,7);
		System.out.println(b1);
		System.out.println(a);
		
		
		
		
	}

}
