package com.vtalent.narendar;

import java.util.Scanner;

public class Employee {
	
	int eId;
	double eSalary;
	long eMobile;
	static Employee[] empArray=new Employee[4];
	
public static void insertData()

{
	for(int i=0;i<=empArray.length-1;i++)
	{
		Employee emp=new Employee();
		emp.eId=100+i;
		emp.eSalary=2500*(10+i);
		emp.eMobile=96035483+(i*2);
		empArray[i]=emp;
	}
}
public static void displayEmp()
		{
	for(int i=0;i<=empArray.length-1;i++)
	{   
		
		if(null!=empArray[i])
		{
		Employee emp=(Employee)empArray[i];
		System.out.println("id="+emp.eId+" "+"salary="+emp.eSalary+" "+"mobile="+emp.eMobile);
		}
		}
		}

public static void displayEmp1()
{
	int tempId;
	System.out.println("enter ID value");
	
	Scanner sc=new Scanner(System.in);
	tempId=sc.nextInt();
	for(int i=0;i<=empArray.length-1;i++)
	{
		Employee emp=(Employee)empArray[i];
		
		if(tempId==emp.eId)
			{
			System.out.println("id="+emp.eId);
			System.out.println("Salary="+emp.eSalary);
			System.out.println("mobile no="+emp.eMobile);
			break;
			}
	}
	
	}

public static void updateEmp()
{
	int tempId;
	System.out.println("enter ID value");
	
	Scanner sc=new Scanner(System.in);
	tempId=sc.nextInt();
	for(int i=0;i<=empArray.length-1;i++)
	{
		Employee emp=(Employee)empArray[i];
		
		if(tempId==emp.eId)
			{
			System.out.println("id="+emp.eId);
			System.out.println("Salary="+emp.eSalary);
			System.out.println("mobile no="+emp.eMobile);
			System.out.println("enter salary to update ");
			emp.eSalary=sc.nextInt();
			empArray[i]=emp;
			
			System.out.println("updated salary="+emp.eSalary);
			break;
			
			}
	}
	
}

public static void deleteEmp()
{
	int tempId;
	System.out.println("enter ID value");
	
	Scanner sc=new Scanner(System.in);
	tempId=sc.nextInt();
	for(int i=0;i<=empArray.length-1;i++)
	{
		Employee emp=(Employee)empArray[i];
		
		if(tempId==emp.eId)
			{
			System.out.println("id="+emp.eId);
			System.out.println("Salary="+emp.eSalary);
			System.out.println("mobile no="+emp.eMobile);
			
			empArray[i]=null;
			System.out.println("employee details deleted");
			
			break;
			}
	}
	

}

public static void main(String[] args)
{
	insertData();
	//displayEmp1();
	//updateEmp();
	deleteEmp();
	displayEmp();
}

}
