package com.vtalent.nagaraju.basics;

import java.util.Scanner;

public class WrapperEx {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string to be convertered into integer");
		String str=scanner.next();
//       Integer i=new Integer(str);
//       int i1=i.intValue();
		//int i=Integer.parseInt(str);
		//float salary=Float.parseFloat(str);
		double sal;
		if(null!=str){
			try{
				sal=Double.parseDouble(str.trim());
				 System.out.println("sucessfully converted into integer---"+sal);
			}catch(Exception e){
				sal=0.0;
				System.out.println("sucessfully converted into integer---"+sal);
			}
		}
       
	}

}
