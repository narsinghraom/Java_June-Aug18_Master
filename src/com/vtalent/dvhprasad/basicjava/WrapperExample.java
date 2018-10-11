package com.vtalent.dvhprasad.basicjava;

import java.util.io*;

public class WrapperExample {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a string to convert to data type");
	String str=input.next();
	Integer i1=new Integer(str);
	int i=i1.intValue();
	//int i=Integer.parseInt(str);
	float salary=Float.parseFloat(str);
	double sal;
	
	if (null!=str){
		try{
			sal=Double.parseDouble(str);
			System.out.println("Converterd to interger"+sal);
			}
		catch(Exception e ){
			sal=0.0;
			System.out.println("Converted to Integer"+sal);
		}
	}
	input.close();
	
}
}
