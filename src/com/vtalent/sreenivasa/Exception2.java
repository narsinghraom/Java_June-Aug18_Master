package com.vtalent.sreenivasa;

public class Exception2 
{
	public void disp(String s) throws Exception
	{
		int i=Integer.parseInt(s);
		if(i>18)
		{
			throw new Exception1("your eligible");
		}
		else
		{
			System.out.println("your not eligible");}
	}
	public String toString()
	{
		return "your eligible";
	}

}
