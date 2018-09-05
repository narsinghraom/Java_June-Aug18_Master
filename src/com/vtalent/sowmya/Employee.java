package com.vtalent.sowmya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
	private int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	private String empname;
}
class EmployeeList
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <Employee> listofemp=new ArrayList<Employee>();
		Employee emp=null;
		while(true){
			emp=new Employee();
			System.out.println("Enter Id");
			emp.setEmpid(sc.nextInt());
			System.out.println("Enter employee Name");
			emp.setEmpname(sc.next());
			listofemp.add(emp);
			System.out.println("Do You Want to Continue y/n");
			String con=sc.next();
			if(con.equalsIgnoreCase("n")){
				System.exit(0);
			}
		
		Iterator itr=listofemp.iterator();
		while(itr.hasNext()){
			Employee emp1=(Employee)itr.next();
			System.out.println("id="+emp1.getEmpid());
			System.out.println("name="+emp1.getEmpname());
			
			}
		}
				
		}
		
		
	}
	


