package com.vtalent.jyothsna;

import java.util.Scanner;

public class TeamA {
   
static	String TeamAname;
 int TeamAovers;
 double TeamAScore,TeamAwickets;
float runrate;
 
 public void function() { 
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Overs played");
 TeamAovers=s.nextInt();
 /*System.out.println("enter the team score");
 TeamAScore=s.nextDouble();
 System.out.println("enter the wickets");
 TeamAwickets=s.nextDouble();*/
 }
  public float runrate1() {
	 runrate=(float)TeamAScore/TeamAovers;
	 return runrate;
	
}
}
 

	 


