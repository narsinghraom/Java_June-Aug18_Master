package com.vtalent.dvhprasad.basicjava;

public class ExceptionExample {
String str;
int i;
int[] arr=new int[3];
public void function(){
	try{
		System.out.println("fasaakkk");
		System.out.println(str.charAt(0));//null you are trying to acess null value
		i=1/arr[0];//java.lang.ArithmeticException: / by zero
		arr[3]=5;//3 you are trying more than a length value

		}

	catch(ArrayIndexOutOfBoundsException ae){
	System.out.println(arr.length +" you are trying more than a length value");
				}
	catch(NullPointerException np){
		System.out.println(str + " You are trying to aceess null value");
				}
	catch(Exception e){
		System.out.println(e);
				}

}


public static void main(String[] args) {
	ExceptionExample ee=new ExceptionExample();
	ee.function();
System.out.println("Hello");
System.out.println(ee.arr[2]);
}

}