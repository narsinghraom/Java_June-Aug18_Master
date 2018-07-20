  package com.vtalent.jyothsna;

import java.util.Scanner;

public class Employee {
	static int eId;
	double eSalary;
	long eMobile;
	static Employee[] empArray=new Employee[4];
	private static int i;
	public static void insertData() 
	{
		for(int i=0; i<=empArray.length-1;i++)
		{
			Employee emp=new Employee();
			emp.eId=200+i;
			emp.eSalary=2500*(10*i);
			emp.eMobile=8886799+(i*2);
			empArray[i]=emp;
			
		}
	}
	public static void displayemp() {
		for(int i=0; i<=empArray.length-1;i++) {
			Employee emp=(Employee)empArray[i];
			System.out.println("Id="+emp.eId+"salary="+emp.eSalary+"mobile="+emp.eMobile);
			/*Scanner s=new Scanner(System.in);
			System.out.println("enter the empid");
			int eid=s.nextInt();
			if(eid==100+i)
			{
				System.out.println("Id="+emp.eId+"salary="+emp.eSalary+"mobile="+emp.eMobile);
			}
			else {System.out.println("no data found");}*/
		}
		}
	/*public static void displayemp1() {
		int temp  =200;
			for(int i=0;i<=empArray.length-1;i++);
			{
				Employee emp=(Employee)empArray[i];
			 if(temp==emp.eId)
				{
					System.out.println("Id="+emp.eId);
					System.out.println("Id="+emp.eSalary);
			System.out.println("Id="+emp.eMobile);
		//break;
	}
	}
			}*/
	public static void updateemp() {
		int temp  =200;
			for(int i=0;i<=empArray.length-1;i++);
			{
				Employee emp=(Employee)empArray[i];
			 if(temp==eId)
				{
					System.out.println("Id="+emp.eId);
					System.out.println("salary="+emp.eSalary);
			System.out.println("Id="+emp.eMobile);
			emp.eSalary=40000;
			emp.eMobile=7895;
			empArray[i]=emp;
			System.out.println(emp.eSalary);
			System.out.println(emp.eMobile);
			displayemp();
	       }
	   }
			
	}
	/*public static void deleteemp() {
		int temp  =200;
			for(int i=0;i<=empArray.length-1;i++);
			{
				Employee emp=(Employee)empArray[i];
			 if(temp==emp.eId)
				{
					System.out.println("Id="+emp.eId);
					System.out.println("salary="+emp.eSalary);
			System.out.println("Id="+emp.eMobile);
			emp.eSalary=40000;
			emp.eMobile=7895;
			empArray[i]=null;
			//System.out.println(emp.eSalary);
			//System.out.println(emp.eMobile);
			System.out.println("salary="+emp.eSalary);
			System.out.println("Id="+emp.eMobile);

	       }
	   }
			
	}*/
	public static void main(String[] arg)
	{
		insertData();
		displayemp();
		//displayemp1();
		updateemp();
		//deleteemp();
	}
}
/*public void displayemp() {
	int temp eId=200;
		for(int i=0;i<=empArraY.lenth-1;i++);
		{
			employee emp=(employee)empArray[i]
					if(empeId==emp.eId{[i]);
			{
				System.out.println("Id="+emp.eId);
				System.out.println("Id="+emp.esalary);
		System.out.println("Id="+emp.emobile);
	break;
}
}
}*/


	


	

	
	


