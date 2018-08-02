package com.vtalent.prasad;

class OuterExample{
private int i=12;
public void function(int i){
	System.out.println(this.i+i);
}
static class InnerExample{
	float f=1.5f;
	public  void function(float f)
	{
		OuterExample O=new OuterExample();
		O.function((int)f);
		System.out.println(this.f+f);
	}
}
public static void main(String args[])
{
	OuterExample.InnerExample ie=new OuterExample.InnerExample();
	ie.function(2.5f);
}
}