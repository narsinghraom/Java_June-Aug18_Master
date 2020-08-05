package com.vtalent.sreenivasa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedExample {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the id");
		//String id=br.readLine();
		//int i1=Integer.parseInt(id);
		int i1=Integer.parseInt(br.readLine());
		System.out.println("enter the salary");
		String salary=br.readLine();
		double d=Double.parseDouble(salary);
		System.out.println("enter the name");
		String name=br.readLine();
		System.out.println("the id is:"+i1+" "+"the salaryis:"+salary+" "+"the name is:"+name);

	}

}
