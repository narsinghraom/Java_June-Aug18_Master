package com.vtalent.narendar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListExample {

	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<CollectionEmployee> list=new ArrayList<CollectionEmployee>();
		
		CollectionEmployee emp=null;
		
		//while(true)
		//{
			emp=new CollectionEmployee();
			System.out.println("enter employee id");
			emp.setEmpId(sc.nextInt());
			System.out.println("enter employee name");
			emp.setEmpName(sc.next());
			
			list.add(emp);
			
			System.out.println("collection ref variable"+list);
			
			/*System.out.println("do you want to continue Y/N");
			String con=sc.next();			
			if(con.equalsIgnoreCase("N"))
			{
			System.exit(0);
			}
			*/
		
		
		/*Iterator<CollectionEmployee> itr=list.iterator();
		while(itr.hasNext())
		{
		CollectionEmployee emp1=(CollectionEmployee)itr.next();
		System.out.println("output is"+emp1);
		*/
		for(CollectionEmployee emp1:list)
		{
			System.out.println("for each "+emp1);
		System.out.println("id="+emp1.getEmpId());
		System.out.println("employee name="+emp1.getEmpName());
		
		}
		
		}
	    }

//}
	

	


