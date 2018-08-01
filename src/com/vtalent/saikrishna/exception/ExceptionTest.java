package com.vtalent.saikrishna.exception;

import java.util.Scanner;

public class ExceptionTest 
{
	public static void main(String[] args) 
	{
		ExceptionExample1 ee=new ExceptionExample1();
		//ee.function();
			Scanner s=new Scanner(System.in);
			   System.out.println("enter age");
			  String str=s.next();
			 try{
		ee.function(str);
		}
		catch(AgeException ae)
		{
			System.out.println("enter proper age");
		}
	}
}
