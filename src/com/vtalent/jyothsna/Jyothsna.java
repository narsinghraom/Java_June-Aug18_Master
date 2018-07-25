package com.vtalent.jyothsna;

import java.util.Scanner;

public class Jyothsna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the id");
		int id=s.nextInt();
		System.out.println("enter the salary");
		float salary=s.nextFloat();
		System.out.println("enter name");
		String name=s.nextLine();
		System.out.println("id is="+id+" "+"salary is:"+salary+" "+"name is:"+name);

	}

}
