package com.vtalent.sreenivasa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee emp=null;
		while(true)
		{
			emp=new Employee();
			System.out.println("enter the empid");
			emp.setEmpid(s.nextInt());
			System.out.println("enter the empname");
			emp.setEmpname(s.next());
			al.add(emp);
			System.out.println("do you want continue y/n");
			String ss=s.next();
			if(ss.equalsIgnoreCase("n"))
			{
				System.exit(0);
			}
			
			for(Employee e:al)
			{
				System.out.println("the id is="+e.getEmpid());
				System.out.println("the name is="+e.getEmpname());
			}
			/*Iterator itr=al.iterator();
			while(itr.hasNext())
			{
				Employee e=(Employee)itr.next();
				System.out.println("the id is="+e.getEmpid());
				System.out.println("the name is="+e.getEmpname());
			}*/
			
			
			/*System.out.println("the empid is="+emp.getEmpid());
			System.out.println("the name is="+emp.getEmpname());*/
		}

	}

}
