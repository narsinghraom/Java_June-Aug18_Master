package com.vtalent.sowmya;

import java.util.Scanner;

public class ExceptionExample{
	String str;
	int[] iArray=new int[3];
	static int k=1;

	/*class AgeException extends ExceptionExample
	{
	public String toString(){
		return "Age should>25";*/
	
	public void function()throws NullPointerException,ArithmeticException,ArrayIndexOutOfBoundsException
	{
	
	/*public void function(String str)
		this.str=str;*/
		
			char ch=this.str.charAt(0);
			k=k/iArray[0];
			iArray[3]=5;
			//k=k*5;
	}
		
		/*catch(Exception e){
			System.out.println("str=is a null");
		}*/
		
	
	
	public static void main(String args[]){
		ExceptionExample e1=new ExceptionExample();
		try
		{
			e1.function();
			if(k>18)
			{
				throw new AgeException();
			}
			else
			{
				System.out.println("eligible");
			}
		}catch(NullPointerException np)
			{
				System.out.println(np+"enter string object");
			}
			
			catch(ArrayIndexOutOfBoundsException aie)
			{
				System.out.println(aie+"enter correct array siz");
			}
			catch(ArithmeticException ae )
			{
				System.out.println(ae+"enter correct value");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
				
			
				
			
				
				
			
	/*	}
		Scanner sc=new Scanner(System.in);
		String str=null;
		System.out.println("enter str value");
		str=sc.next();
		examplref.function(str);
	}
*/
}
	}

