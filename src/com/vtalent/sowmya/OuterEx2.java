package com.vtalent.sowmya;

public class OuterEx2 {
	private int i=10;
	public void function(int i)
	
	{
		
		System.out.println(this.i+i);
		
			
		}

static class InnerEx
{
	float f=1.5f;
	public static void function(float f)
	{
		OuterEx2 o=new OuterEx2();
		o.function((int)f);
		System.out.println(f+f);
	}
}
public static void main(String[] args) {
//	OuterEx2.InnerEx ie=new OuterEx2.InnerEx();
//	ie.function(2.5f);
	OuterEx2.InnerEx.function(2.5f);
}

}
