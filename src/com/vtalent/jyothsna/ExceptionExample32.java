package com.vtalent.jyothsna;
class ExceptionExample32
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
		ExceptionExample1 e1=new ExceptionExample1();
		try
		{
			e1.function();
			if(e1.k<25) 
			{
				throw new AgeException();
			}else
				System.out.println("your eligible");
			}
		catch(NullPointerException npe)
		{
				System.out.println("user friendly msgs");
	    }
		catch(Exception e)
		{
			System.out.println("user friendly msgs");
			
		}
		
		}
}

