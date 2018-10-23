package com.vtalent.kalyani.basics;

import java.util.Scanner;

public class ODITest {

	public static void main(String[] args) {
		TeamA teamA = new TeamA();
		TeamB teamB = new TeamB();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the Team A details below");
		System.out.println("Please enter the Team A Name: ");
			teamA.teamName = sc.nextLine();
			
		System.out.println("Please enter the Team A Overs: ");
			teamA.teamOvers = sc.nextInt();
			
		System.out.println("Please enter the Team A Score: ");
			teamA.teamScore = sc.nextInt();
		
		System.out.println("Please enter the Team A Wickets: ");
			teamA.teamWickets = sc.nextInt();
			
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Please enter the Team B details below");
		System.out.println("Please enter the Team B Name: ");
		teamB.teamName = sc2.nextLine();
		
		System.out.println("Please enter the Team B Overs: ");
		teamB.teamOvers = sc2.nextInt();
		
		System.out.println("Please enter the Team B Score: ");
		teamB.teamScore = sc2.nextInt();
		
		System.out.println("Please enter the Team B Wickets: ");
		teamB.teamWickets = sc2.nextInt();
		
		System.out.println("Print the Team A details by reading from console");
		System.out.println("Team Name: " + teamA.teamName);
		System.out.println("Team Overs: " + teamA.teamOvers);
		System.out.println("Team Score: " + teamA.teamScore);
		System.out.println("Team Wickets: " + teamA.teamWickets);
		
		System.out.println("Print the Team B details by reading from console");
		System.out.println("Team Name: " + teamB.teamName);
		System.out.println("Team Overs: " + teamB.teamOvers);
		System.out.println("Team Score: " + teamB.teamScore);
		System.out.println("Team Wickets: " + teamB.teamWickets);

		
		
		
	}


	}


