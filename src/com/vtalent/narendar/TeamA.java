package com.vtalent.narendar;

import java.util.Scanner;

public class TeamA {
	public String teamNameA;
	float teamOversA;
	long teamScoreA;
	int teamWicketsA;
	
	public void teamName()
	{
	System.out.println("enter team A name");
	Scanner sc=new Scanner(System.in);
	teamNameA=sc.next();
	}
	public void score()
	{
	System.out.println("1st innings by"+" "+teamNameA);
	System.out.println("enter overs played");
	Scanner sc=new Scanner(System.in);
	teamOversA=sc.nextFloat();
	float runrate=5.0f;
	
	if(teamOversA==50&&teamWicketsA==10)
	teamScoreA=(long) ((long)runrate*teamOversA);
	System.out.println(teamScoreA+" "+"for"+" "+teamWicketsA);

	if(teamOversA<=50&&teamWicketsA<=10)
	teamScoreA=(long) ((long)runrate*teamOversA);
	System.out.println(teamScoreA+" "+"for"+" "+teamWicketsA);

	if(teamOversA<50&&teamWicketsA==10)
	teamScoreA=(long) ((long)runrate*teamOversA);
	System.out.println(teamScoreA+" "+"for"+" "+teamWicketsA);
	}
    }
