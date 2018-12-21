package com.vtalent.dvhprasad.basicjava;

public class ExceptionExample1 {
String str;
int i;
int[] arr=new int[3];
public void function()throws Exception{
	System.out.println(str.charAt(0));
	i=1/arr[2];
	arr[3]=5;
	
		}
public static void main(String[] args) {
	ExceptionExample1 ee=new ExceptionExample1();
	try{
		ee.function();
}
	catch(Exception e){
		
		System.out.println(e);//java.lang.NullPointerException
	
		
System.out.println(ee.i);	//java.lang.ArithmeticException: / by zero
System.out.println(ee.arr[3]);//java.lang.ArrayIndexOutOfBoundsException: 3
}
}
}