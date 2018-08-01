package com.vtalent.sreenivasa;

public class OuterExample 
{
	private int i=20;
	public void function(int i)
	{
		System.out.println(this.i+i);
	}
	class InnerExample
	{
		float f1=1.5f;
		public void function(float f1) 
		{
			OuterExample o=new OuterExample();
			o.function((int)f1);
			System.out.println(this.f1+f1);
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
/*OuterExample oe=new OuterExample();
OuterExample.InnerExample oe1=oe.new InnerExample();*/
		//or
		OuterExample.InnerExample oe1=new OuterExample(). new InnerExample();
oe1.function(2.5f);
	}

}
