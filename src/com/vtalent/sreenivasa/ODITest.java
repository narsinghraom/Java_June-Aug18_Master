package com.vtalent.sreenivasa;

import java.util.Scanner;

public class ODITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
TeamA a=new TeamA();
TeamB b=new TeamB();
System.out.println("please enter the teamA name");
a.teamName=s.nextLine();
System.out.println("please enter the teamB name");
b.teamName=s.next();
System.out.println("welcome to odi "+a.teamName+"v/s"+b.teamName);
System.out.println("1st inning by team "+a.teamName);
a.disp();
System.out.println("enter the teamscores");
a.teamScoresA=s.nextInt();
System.out.println("enter the teamwickets");
a.teamWicket=s.nextInt();
System.out.println(a.teamName+"Scores "+a.teamScoresA+"/"+a.teamWicket+"with current runrate:"+a.runRates());
System.out.println("2nd innings by team "+b.teamName);
b.disp1();
System.out.println("enter the teamscores");
b.teamScoresb=s.nextInt();
System.out.println("enter the teamwickets");
b.teamWicket=s.nextInt();
System.out.println(b.teamName+"Scores "+b.teamScoresb+"/"+b.teamWicket+"with current runrate:"+b.runRates1());

if(a.teamScoresA>b.teamScoresb)
{
	System.out.println(a.teamName+" win by "+(a.teamScoresA-b.teamScoresb)+"runs");
}
else
	System.out.println(b.teamName+" win by "+(b.teamScoresb-a.teamScoresA)+"runs");
	}

}
