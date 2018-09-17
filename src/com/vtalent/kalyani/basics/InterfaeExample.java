package com.vtalent.kalyani.basics;

interface Abc
{
	void function(int x);
	void function(int x, int y);
}
interface xyz
{
	void function(int x);
	void function(String str);
}
class First123 implements Abc
{
	public void function(int x)
	{
		System.out.println(x);
	}
	public void function(int x, int y)
	{
		System.out.println(x+y);
	}
}

class Second extends First123 implements xyz
{
public void function(String str)	
{
	System.out.println(str.charAt(0));
}
}
public  class InterfaeExample
{

	public static void main(String[] args)
	{
	//xyz t=new First();
	Abc a=new First123();
	
	Abc b=new Second();
	xyz c=new Second();
	a.function(2);
	a.function(2, 3);
	b.function(5);
	b.function(3, 4);
	c.function("hi");
	Second st=new Second();
	st.function(3);
	st.function("hi");
	

	}
	}

