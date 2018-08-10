package com.vtalent.narendar;

import java.util.Scanner;

public class TeamB extends TeamA {
	public String teamNameB;
	float teamOversB;
	int teamScoreB;
	int teamWicketsB;
	
	public void teamName()
	{
	System.out.println("enter team B name");
	Scanner sc=new Scanner(System.in);
	teamNameB=sc.next();
	}
	public void score() 
	{
	System.out.println("1st innings by"+" "+teamNameB);
	System.out.println("enter overs played");
	Scanner sc=new Scanner(System.in);
	teamOversB=sc.nextFloat();
	
	try{
	if(teamOversB>50){
		throw new ODIException().new OversException();
	}}
	catch(Exception e)
	{
		System.out.println("overs should not be greater than 50");
	
	}
	if(teamOversB<=50)
	{
	System.out.println("enter runrate");
	Scanner sc1=new Scanner(System.in);
	float runrate=sc1.nextFloat();
	teamScoreB=(int)(runrate*teamOversB);
	
	
	if(teamOversB<50)
	{
	teamScoreB=(int)(runrate*teamOversB);
	teamWicketsB=10;
	System.out.println(teamScoreB+"/"+teamWicketsB);
	}
	else
	{
	if(teamScoreB>=300)
 	{
	teamWicketsB=5;
	System.out.println(teamScoreB+"/"+teamWicketsB);
	}
if(teamScoreB<300&&teamScoreB>250)
	{
	teamWicketsB=6;
	System.out.println(teamScoreB+"/"+teamWicketsB);
    }
if(teamScoreB<250&&teamScoreB>200)
	{
	teamWicketsA=7;
	System.out.println(teamScoreB+"/"+teamWicketsB);
	}
if(teamScoreA<200)
	{
	teamWicketsA=7;
	System.out.println(teamScoreB+"/"+teamWicketsB);
	}
	
	 
	
	
	}
	}
}}