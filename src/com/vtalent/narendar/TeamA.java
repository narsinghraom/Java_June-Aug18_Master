package com.vtalent.narendar;

import java.util.Scanner;

public class TeamA {
	public String teamNameA;
	float teamOversA;
	int teamScoreA;
	int teamWicketsA;
	int count=0;
	
	void weather() throws Exception
	{
		System.out.println("Is it raining?(yes/no)");
		Scanner s=new Scanner(System.in);
		String s1= s.next();
		if(s1.equals("yes"))
		{
			count++;
			Thread.sleep(1000);
			if(count==2){ 			
				throw new ODIException().new WeatherException();			
			}
			weather(); 		 
		
	}
	}
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
	
	try{
	if(teamOversA>50)
	{
		throw new ODIException().new OversException();
				
		}}
	catch(Exception e)
	{
		System.out.println("overs should not be greater than 50");
	
	}
	if(teamOversA<=50)
	{
	System.out.println("enter runrate");
	Scanner sc1=new Scanner(System.in);
	float runrate=sc1.nextFloat();
	teamScoreA=(int)(runrate*teamOversA);
	
	if(teamOversA<50)
	{
	teamScoreA=(int)(runrate*teamOversA);
	teamWicketsA=10;
	System.out.println(teamScoreA+"/"+teamWicketsA);
	}
	
	else {

if(teamScoreA>=300)
	 	{
		teamWicketsA=5;
		System.out.println(teamScoreA+"/"+teamWicketsA);
	 	}
if(teamScoreA<300&&teamScoreA>250)
		{
		teamWicketsA=6;
	    System.out.println(teamScoreA+"/"+teamWicketsA);
		}
if(teamScoreA<250&&teamScoreA>200)
		{
		teamWicketsA=7;
		System.out.println(teamScoreA+"/"+teamWicketsA);
		}
if(teamScoreA<200)
		{
		teamWicketsA=7;
		System.out.println(teamScoreA+"/"+teamWicketsA);
	}

	}
	}
	
	}
    }
