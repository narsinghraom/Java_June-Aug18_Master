package com.vtalent.saikrishna.exception;

public class ExceptionTest 
{
	public static void main(String[] args) 
	{
		ExceptionExample1 ee=new ExceptionExample1();
		//ee.function();
		try
		{
		ee.function();
		}
		catch(ArithmeticException ne)
		{
			System.out.println("invalid ");
		}
	}
}
