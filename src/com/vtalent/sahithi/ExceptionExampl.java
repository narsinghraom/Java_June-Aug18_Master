package com.vtalent.sahithi;

public class ExceptionExampl {
	String str;
	int[] iArray=new int[3];
	int k=1;
	public void function(){
//		char ch=str.charAt(0);//Exception in thread "main" java.lang.NullPointerException if sop(ch)
		
		k=k/iArray[0];//Exception in thread "main" java.lang.ArithmeticException: / by zero if sop(k)
		
//		iArray[3]=5;//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException if sop(iArray[3]
		
		System.out.println(k);
	}
	public static void main(String[] args){
		ExceptionExampl e1=new ExceptionExampl();
		e1.function();
		
	}

}
