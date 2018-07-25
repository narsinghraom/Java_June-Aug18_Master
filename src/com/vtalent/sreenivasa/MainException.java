package com.vtalent.sreenivasa;

import java.util.Scanner;

public class MainException {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Exception2 e=new Exception2();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the your age");
	    String x=s.next();
		try{
			e.disp(x);
		}catch(Exception e1){
			System.out.println(e);
		}
		

	}

}
