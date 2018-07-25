package com.vtalent.jyothsna;
public class AgeException extends Exception{
	public String toString() {
		return"Age should>25";
	}
}
class ExceptionExample1
{ 
	String str;
	int[] i=new int[3];
	int k=1;
	public void function()throws NullPointerException,ArrayIndexOutOfBoundsException,Exception
	{
		char ch=str.charAt(0);
		k=k/i[0];
		i[3]=5;
		k=k*5;
	}
	public static void main(String arg[]) {
		ExceptionExample32 e1=new ExceptionExample32();
		try
		{
			e1.function();
			if(e1.k<25) 
			{
				throw new AgeException();
			}
			}
		catch(NullPointerException npe)
		{
				System.out.println(npe);
	    }
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		}
}
