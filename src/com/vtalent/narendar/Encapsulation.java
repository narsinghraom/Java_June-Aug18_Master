package com.vtalent.narendar;

public class Encapsulation {
private int empId;
private double empSalary;
public void setEmpId(int empId)
{
	this.empId=empId;
}

public void setEmpSalary(double empSalary)
{
	this.empSalary=empSalary;
}
public int getEmpId()
{
return empId;	
}
public double getEmpSalary()
{
	return empSalary;
}
	public static void main(String[] args)
	{
		Encapsulation e=new Encapsulation();
		//e.empId()=100;//error,why because empId is a private variable i.e hiding in the object and cant accessable in another class
		e.setEmpSalary(25000);
		e.setEmpId(101);
		System.out.println(e.getEmpId()+" "+e.getEmpSalary());
		
		
	}
}