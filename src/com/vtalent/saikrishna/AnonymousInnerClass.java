package com.vtalent.saikrishna;
public class AnonymousInnerClass 
{
	public void f1(Example e1)
	{
		e1.f1(10);
	}
	public static void main(String[] args) 
	{
		AnonymousInnerClass ai=new AnonymousInnerClass();
		ai.f1(new Example()
		{
			public void f1(int i)
			{
				System.out.println(i);
			}
		}
		);
		/*Example e1=new Example()
				{
			public void f1(int a)
			{
				System.out.println(a+a);
			}
				};
				e1.f1(23);*/
	}
}
