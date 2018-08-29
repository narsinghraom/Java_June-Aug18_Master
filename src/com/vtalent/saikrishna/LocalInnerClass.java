package com.vtalent.saikrishna;

public class LocalInnerClass 
{
	int i=10;
	public void f1()
	{
		System.out.println("f1()");
		 class LocalInner
		{
			int a;
			void f1(int i)
			{
				a=15;
				System.out.println(this.a+i);
			}
		}
		 LocalInner in=new LocalInner();
		 in.a=10;
		 in.f1(10);
	}
	public static void main(String[] args) 
	{
		LocalInnerClass li=new LocalInnerClass();
		li.f1();
	}
}
