package com.vtalent.kalyani.basics;

class SuperKeyword1
{
	int a=10;
	int b=5;
	public void m1(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+b+this.a+this.b);
	}
}
	
 class Box extends SuperKeyword1
{
	int a=20;
	int b=30;
	public void m2(int a, int b)
	{
		this.a=a;
		this.b=b;
		super.a=a;
		super.b=b;
		System.out.println(this.a+a+super.a+super.b);

	}

}
public class Test12 {

	public static void main(String[] args)
	{
		Box t= new Box();
		t.m1(5, 5);
		t.m2(10, 10);


	}

}
