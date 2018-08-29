package com.vtalent.saikrishna.exception;

import java.util.Scanner;

//import java.util.Scanner;

public class ExceptionExample1 
{
	String s1;
	int[] i=new int[3];
	int k=1;
	Scanner s=new Scanner(System.in);
   public void function() throws AgeException
	{
	   System.out.println("enter age");
	   int i1=s.nextInt();
	   if(i1>24)
	   {
		   System.out.println("your eligible");
	   }
	   else
	   {
		   throw new AgeException();
	   }
	  // int k1=k/i[0];
	   //char ch=s1.charAt(0);
		/*try
		{
			int k1=k/i[0];
		System.out.println(i[4]);
		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("invalid index");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		//System.out.println("after exception");
//		int k1=k/i[0];

		/*try{
		
		char ch=s1.charAt(1);
		}
		catch(NullPointerException nfe)
		{
			System.out.println("dont enter index");
		}*/
	//System.out.println(ch);
}
}
