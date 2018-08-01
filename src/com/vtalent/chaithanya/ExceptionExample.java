package com.vtalent.chaithanya;

public class ExceptionExample
{
	String str;
	int[] iArray=new int[4];
	int k=1;
	public void disp()
	{
		try{
		char ch=str.charAt(0);
		}
		catch(NullPointerException npe)
		{
			System.out.println("here,nullpointer exception occurs to handle by using try-catch block");
		}
		catch(ArithmeticException ae )
		{
		System.out.println("hiii");	
		}
		finally{System.out.println("hello welcome");}
		//iArray[4]=5;
		//k=k/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample e=new ExceptionExample();
		e.disp();
	}

}

