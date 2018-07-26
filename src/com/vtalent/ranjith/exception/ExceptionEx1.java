package com.vtalent.ranjith.exception;

public class ExceptionEx1 {

	String str;
	int[] iArray=new int[3];
	int k=1;
	
	public void function(){
		
		try{
			char ch=str.charAt(0);
			k=k/iArray[0];
			iArray[3]=5;
		}catch(NullPointerException np){
			System.out.println("plz assign value to the str variable ");
		}
		catch(ArithmeticException np){
			System.out.println("dont take zero in denominator");
		}
		catch(ArrayIndexOutOfBoundsException np){
			System.out.println("plz take the size between the  size of array  ");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String args[]){
		ExceptionEx1 e1=new ExceptionEx1();
		e1.function();
	}
}
