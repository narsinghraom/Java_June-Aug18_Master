package com.vtalent.karunya;

import java.util.Scanner;

public class TeamA {
	String teamName;
	double teamOvers;
	double teamScore;
	long teamWickets;
	float runrate;
	void display()
	{
		Scanner s=new Scanner(System.in);
		teamName=s.next();
		System.out.println("enter the teamName:");
		teamOvers=s.nextInt();
		System.out.println("entr the teamOvers:");
		teamScore=s.nextInt();
		System.out.println("enter the team score:");
		teamWickets=s.nextInt();
		System.out.println("enter the team wickets:");
		
	}
	
	

	

}
