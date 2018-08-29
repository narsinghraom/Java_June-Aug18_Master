package com.vtalent.sowmya;
public class OuterEx1 {
	private int i=10;
	public void function(int i)
	
	{
		
		System.out.println(this.i+i);
		
			
		}



public class InnerEx {
	float f=1.5f;
	public void function(float f)
	{
		OuterEx1 o=new OuterEx1();
		
		o.function((int)f);
		
			System.out.println(this.f+f);
		
	}
}

public static void main(String args[])
{
	OuterEx1 oe=new OuterEx1();
OuterEx1.InnerEx ie=oe.new InnerEx();
	ie.function(2.5f);
}
}
