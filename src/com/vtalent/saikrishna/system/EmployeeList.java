package com.vtalent.saikrishna.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeList 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Employee e=null;
	ArrayList<Employee> al=new ArrayList<>();
	 e=new Employee();
	System.out.println("enter empid");
	e.setEmpid(s.nextInt());
	System.out.println("enter name");
	e.setEmpName(s.next());
	al.add(e);
//	System.out.println(al);
	System.out.println("do you want to continue");
	String con=s.next();
	if(con.equalsIgnoreCase("N"))
	{
		System.exit(0);
	}
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		Employee e1=(Employee)itr.next();
		System.out.println(e1.getEmpid()+" "+e1.getEmpName());
	}
	}
}
