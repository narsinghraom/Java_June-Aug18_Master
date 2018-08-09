package com.vtalent.narendar;

public class StaticInner {

   private int i=10;
   public void function(int i)
   		{
   		System.out.println(this.i+i);
   		}

	static class InnerExample {
		 float f=1.5f;
			public static void function(float f)
				{
				StaticInner outer=new StaticInner();
					outer.function((int)f);
					System.out.println(f+f);
	}
	
	}
public static void main(String[] args) throws Exception
{

	StaticInner.InnerExample ie=new StaticInner.InnerExample();
	
StaticInner.InnerExample.function(2.5f);
}
}