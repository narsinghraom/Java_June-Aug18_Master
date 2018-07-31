package com.vtalent.sreenivasa;

import java.util.Scanner;

public class TeamA
{
	String teamName;
	int teamOvers;
	int teamScoresA,teamWicket=8;
	int runRate=6;
	void disp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the overs played");
		teamOvers=s.nextInt();
		}
	public float runRates()
	{
		runRate=teamScoresA/teamOvers;
		return runRate;
	}
	public void disp1()
	{  
		teamScoresA=runRate*teamOvers;
	}
}
