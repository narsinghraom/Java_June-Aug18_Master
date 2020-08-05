package com.vtalent.sreenivasa;

import java.util.ArrayList;

public class Gopal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al=new ArrayList<Employee>();
		Employee emp=new Employee();
		emp.setEmpid(10);
		emp.setEmpname("sreenu");
		System.out.println(al);
		System.out.println(emp.getEmpid()+" "+emp.getEmpname());
	//	System.out.println(al.get(0));
		al.add(emp);
		ArrayList<Integer> al1=new ArrayList<Integer>(8);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
		for(Integer al2:al1)
		{
			System.out.println(al2);
		}
		//System.out.println("the name is:"+al.get(0));
	//	Object obj=al.get(1);
		//System.out.println(obj);
		

	}

}
