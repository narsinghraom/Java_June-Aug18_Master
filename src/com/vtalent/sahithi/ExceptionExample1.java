package com.vtalent.sahithi;

public class ExceptionExample1 {
	String str;
	int[] iArray=new int[3];
	static int k=1;
	
		
	public void function() throws NullPointerException,ArithmeticException,ArrayIndexOutOfBoundsException
	{
		char ch=str.charAt(0);
		int m=k/iArray[0];
		iArray[3]=5;
		k=k*5;
	}
	public static void main(String[] args){
		ExceptionExampl e1=new ExceptionExampl();
		try{
			e1.function();
			if(k<25){
			throw new AgeException();	
		    }
			else{
				System.out.println("eligible");
	        }
		}		
			catch(NullPointerException np){
				System.out.println(np+"please enter string object");
			}
		catch(ArithmeticException ae){
			System.out.println(ae+"please enter any integer value");
		}
		catch(ArrayIndexOutOfBoundsException aiob){
			System.out.println(aiob+"please enter proper aray size");
		}
		catch(Exception e){
			System.out.println(e);
		}
}
}
