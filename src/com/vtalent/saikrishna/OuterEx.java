package com.vtalent.saikrishna;

public class OuterEx 
{
	private int a=10;
	public void fun(int i)
	{
		System.out.println(this.a+i);
	}
	  public class InnerEx
	{
		 float f=1.5f;
		public void fun(float f)
		{
			//fun((int)f);
			OuterEx oe1=new OuterEx();
			oe1.fun((int)f);
			System.out.println(this.f+f);
		}
	}
	public static void main(String[] args) 
	{
		OuterEx oe=new OuterEx();
		InnerEx ie=oe.new InnerEx();
		ie.fun(2.5f);
		//InnerEx ie1=new OuterEx().
		//ie.fun(2.5f);
	}
}
