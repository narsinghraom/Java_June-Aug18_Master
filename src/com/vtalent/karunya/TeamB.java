package com.vtalent.karunya;

import java.util.Scanner;

public class TeamB{
		String teamName;
		int teamOvers;
		int teamScoreB;
		long teamWickets;
		float runrate;
		void display()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the teamName:");
			teamName=s.nextLine();
			System.out.println("entr the teamOvers:");
			teamOvers=s.nextInt();
		    System.out.println("enter the team score:");
			teamScoreB=s.nextInt();
			System.out.println("enter the team wickets:");
			teamWickets=s.nextInt();
			
		}
		void runrate()
		{
			runrate=teamScoreB/teamOvers;
			System.out.println("enter the runrate:");
		}
		public void disp1() {
			// TODO Auto-generated method stub
			
		}

	
	
}
