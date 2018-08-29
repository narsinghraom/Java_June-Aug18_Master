package com.vtalent.sahithi;
import java.util.Scanner;

public class ODITest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Please enter TeamA name");
		String TeamAname=sc.next();
		
		System.out.println("Please enter TeamB name");
		String TeamBname=sc.next();
		
		System.out.println("Welcome to ODI " +TeamAname+ " v/s "+TeamBname);
		
		System.out.println("1st innings By Team"+TeamAname);
		System.out.println("Enter the Overs Played");
		float Aovers=sc.nextFloat();
		
		System.out.println("Enter the runrate");
		float Arunrate=sc.nextFloat();
	
		TeamA ta=new TeamA();
		int Ascore=ta.score(Aovers, Arunrate, TeamAname);
		
		
		System.out.println("2nd innings By Team"+TeamBname);
		System.out.println("Enter the Overs Played");
		float Bovers=sc.nextFloat();
		
		System.out.println("Enter the runrate");
		float Brunrate=sc.nextFloat();
		
		TeamB tb=new TeamB();
		int Bscore=tb.score(Bovers, Brunrate, TeamBname);
		
		      int diff;
		      if(Ascore>Bscore){
		    	  diff=Ascore-Bscore;
		    	  System.out.println(TeamAname+" win by"+diff+"runs");
		      }
		    	  else
		    	  {
		    		  diff=Bscore-Ascore;
		    		  System.out.println(TeamBname+"win by"+diff+"runs");
		      }
		
		      }	
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		
		
		
	


