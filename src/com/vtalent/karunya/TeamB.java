package com.vtalent.karunya;

import java.util.Scanner;

public class TeamB{
		public String teamName;
		int teamOvers;
		int teamScoreB;
		long teamWickets=10;
		int runRate=8;
		void display()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the over played:");
			teamOvers=s.nextInt();
		}
		public float runRate()
		{
			runRate=teamScoreB/teamOvers;
			System.out.println("enter the runrate:");
			return runRate;
		}
		public void display1() {
			// TODO Auto-generated method stub
			teamScoreB=runRate*teamOvers;
			
		}
}

	
	

