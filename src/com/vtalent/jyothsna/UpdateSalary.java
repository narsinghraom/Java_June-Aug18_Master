package com.vtalent.jyothsna;

import java.util.Scanner;

public class UpdateSalary 
{
	int eId;
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
			System.out.println("====================");}}
	public static void updateAll()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			System.out.println("enter the empid");
			int eid=s.nextInt();
			System.out.println("enter the salary");
			double eSalary=s.nextDouble();
			System.out.println("enter the mobile no");
			long eMobile=s.nextLong();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
insertData();
displayemp();
updateAll();
	}

}
