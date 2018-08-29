package com.vtalent.saikrishna.exception;

import java.util.Scanner;

public class ExceptionTest 
{
	private static Scanner s;

	public static void main(String[] args) 
	{
		ExceptionExample1 ee=new ExceptionExample1();
		s = new Scanner(System.in);
			  /* System.out.println("enter age");
			  String str=s.next();*/
			 try{
		ee.function();
		}
		catch(AgeException ae)
		{
			
			System.out.println(ae);
		}
	}
}
