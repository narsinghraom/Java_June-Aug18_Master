package com.vtalent.kalyani.basics;

class overload
{
	public void function(int i)
	{
		System.out.println(overload.class+"value"+i);
	}
	public void function(int i, int j)
	{
		System.out.println(overload.class+"value"+i+j);
	}
public void function(double f)
{
	System.out.println(overload.class+"value"+f);
}
}
class override extends overload
{
	public void function(int i)
	{
		System.out.println(override.class+"value"+i);
	}
	
	public void function(double f)
	{
		System.out.println(override.class+"value"+f);
	}
}


public class Test123 {

	public static void main(String[] args) {
		override or=new override();
		or.function(2.5);
		or.function(2);
		or.function(2, 5);
		

	}

}
