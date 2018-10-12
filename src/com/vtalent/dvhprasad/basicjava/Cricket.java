package com.vtalent.dvhprasad.basicjava;

import java.util.Scanner;

class A{
	String Teamname;
	double Teamovers;
	int  Teamscores;
	int Teamwickets;
	double Teamrunrate;
	
	}
class B{
	String Teamname;
	double Teamovers;
	int Teamscores;
	int Teamwickets;
	double Teamrunrate;
	}

public class Cricket{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 A a=new A();
		 B b=new B();
		 
		 System.out.println("Please Enter TeamA Name:");
		 a.Teamname=sc.nextLine();
		 System.out.println("Please Enter TeamB Name:");
		 b.Teamname=sc.nextLine();
		 
		 System.out.println("Welcome to ODI "+a.Teamname+" v/s "+b.Teamname);
		 System.out.println("1 st Innings By Team India");
		 System.out.println("Enter the Overs played");
		 a.Teamovers=sc.nextDouble();
		 System.out.println("Enter the runrate");
		 a.Teamrunrate=sc.nextDouble();
		 
		 a.Teamscores=(int) (a.Teamovers*a.Teamrunrate);
		 
		 if(a.Teamovers==50 && a.Teamwickets==10){
		 a.Teamscores=(int)(a.Teamrunrate*a.Teamovers);
		 return ;
		 
		// System.out.println("TeamScoreA"+""+"for"+""+a.Teamwickets);
		// System.out.println("india scores"+a.Teamscores+"/"+a.Teamwickets+"with current runrate"+a.Teamrunrate);
		 
		 
		// sc.close();
	 }
	 
	 }}



