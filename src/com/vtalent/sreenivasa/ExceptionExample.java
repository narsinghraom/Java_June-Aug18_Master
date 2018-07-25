package com.vtalent.sreenivasa;

public class ExceptionExample
{
	String str;
	int[] iArray=new int[4];
	int k=1;
	public void disp()
	{
		try{
		char ch=str.charAt(0);
		iArray[4]=5;
		k=k/iArray[0];}catch(NullPointerException ne){System.out.println(ne);}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
	}
		/*try{
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
		finally{System.out.println("hello welcome");}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample e=new ExceptionExample();
		try{
		e.disp();
		if(e.k>25)
		{
			throw new AgeException();
		}
		else
			System.out.println("your are eligible");
		}catch(Exception e1)
		{
			System.out.println(e1);
		}
		
	}

}
