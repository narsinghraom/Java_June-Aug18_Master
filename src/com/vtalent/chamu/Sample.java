package com.vtalent.chamu;

public class Sample 
{
	/*
	 * f6- step over
	 * f8- resume
	 * ctrl+shft+i = checking the value before execution.
	*/
	static int i,j;
	float f1,f2;
	static String s1;
	public void function(float f1,float f2)
	{
		this.f1=f1+f2;
		this.f2=this.f1+f2;
		
	}
	public static int function(int i,int j)
	{
		Sample.i=i+j;
		Sample.j=i*j;
		return Sample.i+j;
	}
	public static void main(String[] args) 
	{
		Sample sample = new Sample();
		//System.out.println(sample.s1.charAt(0));// null pointer Exception
		Sample.s1="Hello";
		System.out.println(sample.s1.charAt(0));
		sample.function(1.5f,1.5f);
		int k = sample.function((int)sample.f1,(int)sample.f2);
		System.out.println(k);
		System.out.println(i+j);
		System.out.println(sample.f1);
		System.out.println(sample.f2);

	}

}
