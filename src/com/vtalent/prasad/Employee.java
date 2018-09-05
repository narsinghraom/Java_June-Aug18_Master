package com.vtalent.prasad;

public class Employee {
int eid;
double esalary;
long emobile;
static Employee[] empArray=new Employee[5];

public static void insertData()
{
	for(int i=0;i<=empArray.length-1;i++)
	{
		Employee emp=new Employee();
			emp.eid=100+i;
		emp.esalary=2000*(10*+i);
		emp.emobile=884895930+(i*2);
		empArray[i]=emp;
		
	}
}
/*public static void displayEmp()
{
	for(int i=0;i<=empArray.length-1;i++)
	{
	Employee emp=(Employee)empArray[i];
	System.out.println("Id="+emp.eid+"salary="+emp.esalary+"mobile="+emp.emobile);
	}
		
		
	}
public static void main(String args[]){
	insertData();
	displayEmp();
}
}*/
static Employee[] empArray2=new Employee[4];
static Scanner sc=new Scanner(System.in);

public static void display

