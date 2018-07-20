package com.vtalent.jyothsna;
interface Abc{
	float pi=3.14f;
	public static final int k=0;
	public void function(int i);
	public abstract void function(float f);
	}
abstract class Calculate
{
	public void add(int i,int j)
	{
	System.out.println(i+j);	
	}
	public void sub(int i, int j)
	{
		System.out.println(i-j);
	}
	public abstract void div(int i, int j);
	public abstract void mul(int i,int j);
}
class CalculateImpl extends Calculate{
	public void div(int i, int j)
	{
		System.out.println(i/j);
	}
public void mul(int i, int j)
{
	System.out.println(i*j);
}
public void funvtion()
{
	div(6,2);
	mul(3,3);
}
}
class Abstract{
	public static void main(String args[]) {
		CalculateImpl c1=new CalculateImpl();
		c1.div(2,3);
		c1.mul(3,2);
		c1.add(2,4);
		c1.sub(4,2);
		}
		}







	


