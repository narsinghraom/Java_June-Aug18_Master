package com.vtalent.sreenivasa;

import java.util.Scanner;

public class TeamA
{
	String teamName;
	int teamOvers;
	int teamScoresA,teamWicket;
	float runRate;
	void disp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the teamA name");
		teamName=s.next();
		System.out.println("enter the teamovers");
		teamOvers=s.nextInt();
		System.out.println("enter the teamscores");
		teamScoresA=s.nextInt();
		System.out.println("enter the teamwickets");
		teamWicket=s.nextInt();
	}
	void runRates()
	{
		runRate=teamScoresA/teamOvers;
		System.out.println("the TeamA runrate is:"+runRate);
	}

}
