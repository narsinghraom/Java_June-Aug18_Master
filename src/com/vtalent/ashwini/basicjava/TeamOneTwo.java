package com.vtalent.ashwini.basicjava;

import java.util.Scanner;

public class TeamOneTwo {
	static int score,score1;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter TeamA name");
		Team1 a=new Team1();
		Team2 b=new Team2();
	
		
		a.setTeamrunrate(6.0f);
		a.setTeamwickets(8);
		a.setTeamname(sc.next());
		System.out.println("please enter TeamB name");
		b.setTeamname(sc.next());
		System.out.println("Welcome to ODI INDIA v/s AUS");
		System.out.println("1st Innings by India");
		System.out.println("Enter the overs played ");
		a.setTeamovers(sc.nextFloat());
		score=a.runScored();
		System.out.println("India Scores"+" "+(score)+" "+"/"+" "+(a.getTeamwickets())+" "+"with Current RunRate :   "+a.getTeamrunrate());
		
		System.out.println("2nd Innings by Team AUS");
		System.out.println("Enter the Overs Played");
		b.setTeamovers(sc.nextFloat());
		b.setTeamrunrate(5.73f);
		b.setTeamwickets(10);
		score1=b.runScored();
		System.out.println("Aus Scored"+" "+(score1)+" "+"/"+" "+(b.getTeamwickets())+" "+"With Current Run Rate :   "+b.getTeamrunrate());
		System.out.println("India Win by"+" "+(score-score1)+" "+"runs...........");
		
		
		sc.close();
	}

	
}
