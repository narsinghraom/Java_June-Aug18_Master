package com.vtalent.karunya.innerclass;

public class OuterEx {
	private int i=10;
	public void function(int i){
		System.out.println(this.i+i);
	}
class InnerEx{
	float f=1.5f;
	public void function(float f)
	{
		OuterEx o=new OuterEx();
		o.function((int)f);
		System.out.println(this.f+f);
	}
}
public static void main(String[] args){
	OuterEx oe=new OuterEx();
	OuterEx.InnerEx ie=oe.new InnerEx();
	ie.function(2.5f);
}
}
