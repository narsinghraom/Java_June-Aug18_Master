package com.vtalent.saikrishna.exception;

import java.util.Scanner;

public class ExceptionExample1 
{
	String s1;
	int[] i=new int[3];
	int k=1;
   public void function(String str) throws AgeException
	{
	   int i1=Integer.parseInt(str);
	   if(i1>24)
	   {
		   throw new AgeException("ur eligible");
	   }
	   else
	   {
		   throw new AgeException("not eligible");
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
