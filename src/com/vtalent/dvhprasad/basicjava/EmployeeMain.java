package com.vtalent.dvhprasad.basicjava;

import java.util.Scanner;

public class EmployeeMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your id");
	int i=sc.nextInt();
	System.out.println("enter your name");
	String s=sc.next();
	System.out.println("enter your salary");
	double d=sc.nextDouble();
	System.out.println("enter your department");
	String s1=sc.next();
	Employee1 emp=new Employee1();
	emp.setEmployeeId(i);
	emp.setEmployeename(s);
	emp.setEmployeesalary(d);
	emp.setEmployeederpartmanet(s1);
	System.out.println(emp.getEmployeeId());
	System.out.println(emp.getEmployeename());
	System.out.println(emp.getEmployeesalary());
	System.out.println(emp.getEmployeederpartmanet());
	sc.close();
	

}
}
