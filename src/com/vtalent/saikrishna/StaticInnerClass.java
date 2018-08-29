package com.vtalent.saikrishna;

public class StaticInnerClass 
{
	private int a=10;
	public void fun(int i)
	{
		System.out.println(this.a+i);
	}
	public static class InnerEx
	{
		 static float f1=1.5f;
		public  static void fun(float f)
		{
			StaticInnerClass si=new StaticInnerClass();
			si.fun((int)f);
			//System.out.println();
			//fun((int)f);
			/*OuterEx oe1=new OuterEx();
			oe1.fun((int)f);*/
			//System.out.println(a);
			//System.out.println(this.f+f);
			InnerEx ie1=new InnerEx();
			System.out.println(f+f1);
		}
	}
	public static void main(String[] args) 
	{
		StaticInnerClass si=new StaticInnerClass();
		InnerEx ee=new InnerEx();
		StaticInnerClass.InnerEx oe=new StaticInnerClass.InnerEx();
	    ee.fun(1.2f);
	    oe.fun(22.3f);
	}
}
