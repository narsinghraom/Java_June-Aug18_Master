package com.vtalent.sreenivasa;

import java.util.Scanner;

public class TeamB 
{
	String teamName;
	int teamOvers;
	int teamScoresb,teamWicket;
	float runRate;
	Scanner s1=new Scanner(System.in);
	void disp1()
	{
		System.out.println("enter the overs played");
		teamOvers=s1.nextInt();
		
	}
	public float runRates1()
	{
		runRate=(float)teamScoresb/teamOvers;
		return runRate;
	}
}
