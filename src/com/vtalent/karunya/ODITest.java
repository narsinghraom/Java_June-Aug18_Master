package com.vtalent.karunya;

import java.util.Scanner;

public class ODITest {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		TeamA a=new TeamA();
		TeamB b=new TeamB();
		System.out.println("please enter the teamA name:");
		a.teamName=s.nextLine();
		System.out.println("please enter the teamB name:");
		b.teamName=s.next();
		System.out.println("welcome to odi"+a.teamName+"v/s"+b.teamName);
		System.out.println("1st inning by team"+a.teamName);
		a.disp();
		a.disp1();
		/*System.out.println("enter the teamscores");
		a.teamScoreA=s.nextInt();
		System.out.println("enter the teamwickets");
		a.teamWicket=s.nextInt();*/
		System.out.println(a.teamName+"Scores "+a.teamScoresA+"/"+a.teamWickets+"with current runrate:"+a.runRate());
		System.out.println("2nd innings by team "+b.teamName);
	    b.display();
	    b.display1();
		/*System.out.println("enter the teamscores");
		b.teamScoresB=s.nextInt();
		System.out.println("enter the teamwickets");
		b.teamWicket=s.nextInt();*/
		System.out.println(b.teamName+"Scores "+b.teamScoreB+"/"+b.teamWickets+"with current runrate:"+b.runRate());

		if(a.teamScoresA>b.teamScoreB)
		{
			System.out.println(a.teamName+" win by "+(a.teamScoresA-b.teamScoreB)+"runs");
		}
		else
			System.out.println(b.teamName+" win by "+(b.teamScoreB-a.teamScoresA)+"runs");
			}

}

	