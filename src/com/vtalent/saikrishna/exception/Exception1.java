package com.vtalent.saikrishna.exception;

public class Exception1 
{
	String s1;
	int[] i=new int[3];
	int k=1;
	void function()
	{
		try
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
		}
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
	
	public static void main(String[] args) 
	{
		Exception1 e1=new Exception1();
		e1.function();
	}
}
