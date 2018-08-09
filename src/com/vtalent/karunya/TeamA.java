package com.vtalent.karunya;

import java.util.Scanner;

public class TeamA {
	String teamName;
	int teamOvers;
	int teamWickets=8;
	int runRate=6;
	int teamScoresA;
    void disp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the oversplayed:");
		teamOvers=s.nextInt();
	}
	public float runRate()
	{
		runRate=teamScoresA/teamOvers;
		return runRate;
	}
	public void disp1()
	{
		teamScoresA=runRate*teamOvers;
	}
	

	

}
