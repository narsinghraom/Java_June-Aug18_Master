package com.vtalent.sreenivasa;

import java.util.Scanner;

public class TeamB 
{
	String teamName;
	int teamOvers;
	int teamScoresb,teamWicket=10;
	int runRate=6;
	Scanner s1=new Scanner(System.in);
	void disp1()
	{
		System.out.println("enter the overs played");
		teamOvers=s1.nextInt();
		
	}
	public float runRates1()
	{
		runRate=teamScoresb/teamOvers;
		return runRate;
	}
	public void disp2()
	{  
		teamScoresb=runRate*teamOvers;
	}
}
