package com.vtalent.nagaraju.basics;

import java.util.Scanner;

public class TeamTest {

	public static void main(String[] args) {
		float runRate=6.0f;
		float runRate1=5.53f;
		TeamA teamA=new TeamA();
		TeamB teamB=new TeamB();
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter TeamA name");
		String teamAname=scanner.next();
		System.out.println("please enter TeamB name");
		String teamBname=scanner.next();
		System.out.println("Welcome to ODI ---"+teamAname+  "--v/s--"  +teamBname);
		System.out.println("1st innings by--- "+teamAname);
		System.out.println("enter the overs palyed");
		float oversPlayedTeamA=scanner.nextFloat();
		if(oversPlayedTeamA<=50){
			teamA.setTeam_A_Score(oversPlayedTeamA, runRate);
			System.out.println(teamAname+"---scored----"+ teamA.getTeam_A_Score() +"----with current RunRate:---"+teamA.getTeam_A_Score()/oversPlayedTeamA );	
		}else{
			try {
				throw new FiftyOversException();
			} catch (FiftyOversException e) {
				System.out.println("you have entered more then fiffty please enter 50 or below fifty");
				
				oversPlayedTeamA=scanner.nextFloat();
				teamA.setTeam_A_Score(oversPlayedTeamA, runRate);
				System.out.println(teamAname+"---scored----"+ teamA.getTeam_A_Score() +"----with current RunRate:---"+teamA.getTeam_A_Score()/oversPlayedTeamA );
				
			}
		}
		
		System.out.println("2nd innings by "+teamBname);
		System.out.println("enter the overs played");
		float oversPlayedTeamb=scanner.nextFloat();
		teamB.setTeam_B_Wickets(oversPlayedTeamb);
		if(oversPlayedTeamb<=50 ){
			
			teamB.setTeam_B_Score(oversPlayedTeamb, runRate1);
			System.out.println(teamBname+"socred---"+ teamB.getTeam_B_Score()+"/"+teamB.getTeam_B_Wickets()+"+with current RunRate:--"+teamB.team_B_Score/oversPlayedTeamb);	
		}else {
			try {
				throw new FiftyOversException();
			} catch (FiftyOversException e) {
				System.out.println("you have entered more then fiffty please enter 50 or below fifty");
				oversPlayedTeamb=scanner.nextFloat();
				teamB.setTeam_B_Score(oversPlayedTeamb, runRate1);
				System.out.println(teamBname+"socred---"+ teamB.getTeam_B_Score()+"+with current RunRate:--"+teamB.team_B_Score/oversPlayedTeamb);	
			}
		}
		
		if (teamA.getTeam_A_Score()>teamB.getTeam_B_Score()){
			System.out.println(teamAname+  "won"  +teamBname);
		}else if (teamA.getTeam_A_Score()==teamB.getTeam_B_Score()) {
			System.out.println("socres are leveled");
		}
		{
			System.out.println(teamBname+"---won---"+teamAname);
		}
       
	}

}
