package com.vtalent.narendar;

import java.util.*;

public class EmployeeList {

	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<CollectionEmployee> list=new ArrayList<CollectionEmployee>();
		
		CollectionEmployee emp=null;
		
		String st="t";
		while(st=="t"?true:false)
			
			
		//while(true)
		{
			emp=new CollectionEmployee();
			System.out.println("enter employee id");
			emp.setEmpId(sc.nextInt());
			System.out.println("enter employee name");
			emp.setEmpName(sc.next());
			
			list.add(emp);
			System.out.println("do you want to continue Y/N");
			
			String con=sc.next();
			if(con.equals("y"))
			{
				st="t";
			}
			else{
				st="f";
			}
		
				
			/*if(con.equalsIgnoreCase("N"))
			{
			System.exit(0);
			}*/
			
		}
		
		Iterator<CollectionEmployee> itr=list.iterator();
		while(itr.hasNext())
		{
		CollectionEmployee emp1=(CollectionEmployee)itr.next();
		//for(CollectionEmployee emp1:listOfEmp)
		
		//System.out.println("id="+emp1.getEmpId());
		//System.out.println("employee name="+emp1.getEmpName());
		System.out.println(emp1);
		}
		}
	}
	

	

