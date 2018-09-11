package com.vtalent.kalyani.basics;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
	
	
Employee ed=new Employee();
Scanner sc=new Scanner(System.in);
System.out.println( "enter emp id");
int s1=sc.nextInt();
System.out.println("enter emp  sal");
double s2=sc.nextDouble();
System.out.println("enter emp name");
String s3=sc.next();
System.out.println("enter emp department");
String s4=sc.next();
System.out.println("enter emp details"+s1 +" " +s2+" "+s3+" "+s4);
sc.close();
ed.setEmployeId(s1);
ed.setEmployeSalary(s2);
ed.setEmployename(s3);
ed.setEmployeeDepartment(s4);




}

}
