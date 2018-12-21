package com.vtalent.kalyani.basics;

abstract class calculator
{
	public int add(int i, int j)
	{
		return i+j;
	}
	public int sub(int i, int j)
	{
		return i-j;
	}
	public abstract int mul(int i, int j);
	public abstract int div(int i, int j);
}
class mycalculator extends calculator
{
	public int mul(int i, int j)
	{
		return i*j;
	}
	public int div(int i, int j)
	{
		return i/j;
	}
}

public class AbstractClass {

	public static void main(String[] args) 
	{
		mycalculator mc=new mycalculator();
		System.out.println(mc.add(2, 5));
		System.out.println(mc.sub(2, 5));
		System.out.println(mc.mul(2, 3));
		System.out.println(mc.div(10, 2));

	}

}
