package com.vtalent.prasad;

import java.util.*;

public class EmployeeList {

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
ArrayList al=new ArrayList();

Employee3 emp=null;
String st="t";
while(st=="t"?true:false){
	emp=new Employee3();
	System.out.println("enter Id");
	emp.setEmpId(sc.nextInt());
	System.out.println("enter name");
	emp.setEmpName(sc.next());
	al.add(emp);
System.out.println("do you want to  continue Y/N");
String con=sc.next();
if(con.equalsIgnoreCase("N")){
	st="f";
}
}
Iterator itr=al.iterator();
while(itr.hasNext()){
	Employee3 emp1=(Employee3)itr.next();
	System.out.println(emp1); 
	 
}
}
}
