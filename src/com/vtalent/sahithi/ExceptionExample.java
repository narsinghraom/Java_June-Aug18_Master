
package com.vtalent.sahithi;

import java.util.Scanner;

public class ExceptionExample {
	String str;
	int[] iArray=new int[3];
	int k=1;
	
	public void function(String str){
		this.str=str;
		try{
			char ch=this.str.charAt(0);
			k=k/iArray[0];
			iArray[3]=5;
		}
		catch(Exception e){
			System.out.println("str=is a null");
		}
	}
	public static void main(String args[]){
		ExceptionExample examplref=new ExceptionExample();
		Scanner sc=new Scanner(System.in);
		String str=null;
		System.out.println("enter str value");
		str=sc.next();
		examplref.function(str);
	}

}
