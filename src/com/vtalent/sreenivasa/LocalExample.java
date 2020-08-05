package com.vtalent.sreenivasa;

public class LocalExample 
{
	int i;
	public void function()
	{
		 class LocalInnerClass
		{
			int k;
			public void function()
			{
				System.out.println(i+k);
			}
		}
		LocalInnerClass li=new LocalInnerClass();
		li.k=20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalExample l=new LocalExample();
		l.i=30;
		l.function();

	}

}
