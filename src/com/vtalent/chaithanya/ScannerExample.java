package com.vtalent.chaithanya;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter the id");
		int id=s.nextInt();
		System.out.println("enter the salary");
		double d=s.nextDouble();
		System.out.println("enter the name");
		String ss=s.next();
		System.out.println("the id is:"+id+" "+"the name is:"+ss+" "+"the salary is:"+d);
		/*System.out.println("enter the id");
		int id=s.nextInt();
		System.out.println("enter the name");
		String name=s.nextLine();
		System.out.println("the id is:"+id+" "+"the name is:"+name);*/
	}

}
