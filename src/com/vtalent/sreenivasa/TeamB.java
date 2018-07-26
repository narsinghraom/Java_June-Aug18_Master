package com.vtalent.sreenivasa;

import java.util.Scanner;

public class TeamB 
{
	String teamName;
	int teamOvers;
	int teamScoresb,teamWicket;
	double runRate;
	void disp1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the teamB name");
		teamName=s1.next();
		System.out.println("enter the teamovers");
		teamOvers=s1.nextInt();
		System.out.println("enter the teamscores");
		teamScoresb=s1.nextInt();
		System.out.println("enter the teamwickets");
		teamWicket=s1.nextInt();
	}
	void runRates1()
	{
		runRate=teamScoresb/teamOvers;
		System.out.println("the Teamb runrate is:"+runRate);
	}
}
