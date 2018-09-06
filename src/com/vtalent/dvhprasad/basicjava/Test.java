 package com.vtalent.dvhprasad.basicjava;

public class Test {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.setEmployeeId(100);
	employee.setEmployeeSalary(25000);
	System.out.println("Employee Id="+employee.getEmployeeId());
	System.out.println("Employee Salary="+employee.getEmployeeSalary());
}
}
