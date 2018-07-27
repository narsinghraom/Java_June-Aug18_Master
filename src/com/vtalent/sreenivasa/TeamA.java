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
		System.out.println("enter the overs played");
		teamOvers=s.nextInt();
		}
	public float runRates()
	{
		runRate=(float)teamScoresA/teamOvers;
		return runRate;
	
	}
}
