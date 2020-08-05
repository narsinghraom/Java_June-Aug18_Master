package com.vtalent.jyothsna;

import java.util.Scanner;

public class TeamB {
	  String name;
	  int overs;
	 double Score;
	  float runrate;
	  Double wickets;
	  
	  
	  public void fuction2() {
		  Scanner s=new Scanner(System.in);
			System.out.println("Enter the Overs played");
		 overs=s.nextInt();
		 /*System.out.println("enter the team score");
		 Score=s.nextDouble();
		 System.out.println("enter the wickets");
		 wickets=s.nextDouble();*/
		 }
		public float runrate2() {
		 runrate=(float)Score/overs;
			 return runrate;
		 }

}

