package com.vtalent.chaithanya;

import java.util.Scanner;

public class TeamB {
	String teamName;
	float teamOvers;
	int teamScore;
	int teamWickets;
	double runRate;
//	double runRate(){
//		return runRate=(float)teamScore/teamOvers;
//	}

public void display()
{
 
	 Scanner s=new Scanner(System.in);
	System.out.println("enter the overs played");
	teamOvers=s.nextFloat();
	if(teamOvers <= 50){
		
	}
	else{
		System.out.println("overs exceed ODI terms please re-enter ");
		teamOvers=s.nextInt();
	}}
public int displayrunRate(){
	 
	 int teamScores;
//	return teamScores = (int)runRate*teamOvers;
	return teamScores = (int)((double)runRate*(float)teamOvers);

}
}



