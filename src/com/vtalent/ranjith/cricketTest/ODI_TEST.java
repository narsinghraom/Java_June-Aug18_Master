package com.vtalent.ranjith.cricketTest;

import java.util.Scanner;
class TeamA {
	String teamName;
	int teamOvers;
	int teamScore;
	int teamWickets;
	double runRate;
 double runRate(){
	return runRate=(double)teamScore/teamOvers;
}
}
class TeamB {
		String teamName;
		int teamOvers;
		int teamScore;
		int teamWickets;
		double runRate;
		double runRate(){
			return runRate=(float)teamScore/teamOvers;
		}
	}
public class ODI_TEST {
	public static void main(String[] args) {
		

	Scanner s=new Scanner(System.in);
	TeamA a=new TeamA();
	
	TeamB b=new TeamB();
	
	System.out.println("Please Enter Team-A Name");
	a.teamName=s.nextLine();
	
	System.out.println("Please Enter Team-B Name");
	b.teamName=s.nextLine();
	
	System.out.println("Welcome to ODI "+a.teamName+" v/s "+b.teamName);
	System.out.println("1st Innings By Team India");
	
	System.out.println("Enter the Overs played");	
	a.teamOvers=s.nextInt();
	System.out.println("Enter The Score of "+a.teamName);
	a.teamScore=s.nextInt();
	System.out.println("Enter the Wickets of "+a.teamName);
	a.teamWickets=s.nextInt();
	
	System.out.println("India Score "+a.teamScore+"/"+a.teamWickets+" with Current RunRate:"+a.runRate());
	System.out.println();
	System.out.println("2nd Innings By Team Aus");
	System.out.println("Enter the Overs played");
	b.teamOvers=s.nextInt();
	System.out.println("Enter The Score of "+b.teamName);
	b.teamScore=s.nextInt();
	System.out.println("Enter the Wickets of "+b.teamName);
	b.teamWickets=s.nextInt();
	System.out.println("India Score "+b.teamScore+"/"+b.teamWickets+" with Current RunRate:"+b.runRate());
	if(a.teamScore>b.teamScore){
		System.out.println(a.teamName+" Win by "+(a.teamScore-b.teamScore)+"runs");
	}
	else{
		System.out.println(b.teamName+" Win by "+(b.teamScore-a.teamScore)+" runs");
	}
		
	s.close();
	}
}
