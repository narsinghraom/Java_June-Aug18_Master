package com.vtalent.narendar;

import java.util.Scanner;

public class TeamB {
	
	public String teamNameB;
	float teamOversB;
	long teamScoreB;
	int teamWicketsB;
	
	public void teamName()
	{

System.out.println("enter teamB name");
Scanner sc=new Scanner(System.in);
teamNameB=sc.next();
}
	public void score()

{
	System.out.println("1st innings by"+" "+teamNameB);
	System.out.println("enter overs played");
	Scanner sc=new Scanner(System.in);
	teamOversB=sc.nextFloat();
	float runrate=4.5f;
	if(teamOversB==50&&teamWicketsB==10)
	teamScoreB=(long) ((long)runrate*teamOversB);
	System.out.println(teamScoreB+" "+"for"+" "+teamWicketsB);

		if(teamOversB<=50&&teamWicketsB<=10)
		teamScoreB=(long) ((long)runrate*teamOversB);
		System.out.println(teamScoreB+" "+"for"+" "+teamWicketsB);

		if(teamOversB<50&&teamWicketsB==10)
		teamScoreB=(long) ((long)runrate*teamOversB);
		System.out.println(teamScoreB+" "+"for"+" "+teamWicketsB);
}
}