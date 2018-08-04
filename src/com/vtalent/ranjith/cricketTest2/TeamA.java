package com.vtalent.ranjith.cricketTest2;

import java.util.Scanner;

public class TeamA {
	static String teamName;
	static int teamOvers;
	static int teamScore;
	static	int teamWickets;
	static 	double runRate;
	static int count=0;	
	Scanner s=new Scanner(System.in);
	TeamB b=new TeamB();
	void weather() throws Exception{
		System.out.println("Is it raining?(yes/no)");	
		String s1= s.next().toUpperCase();
		if(s1.equals("YES")){
			count++;
			Thread.sleep(3000);
			if(count==3){ 			
				throw new ODI_Exceptions().new WeatherException();			
			}
			weather(); 		 
		}
		else{
			teamName(); 
		}
	}
	void teamName(){		
		System.out.println("Please Enter Team-A Name");
		s.nextLine();
		teamName=s.nextLine();		
		System.out.println("Please Enter Team-B Name");		
		TeamB.teamName=s.nextLine();		
		System.out.println("Welcome to ODI "+teamName+" v/s "+TeamB.teamName);
	}
	void scoreCalculationByUsingOversAndRunRate1()throws Exception{


		System.out.println("Enter the Overs played by "+teamName);	
		teamOvers=s.nextInt();
		if(teamOvers>40 && count>=2){

			throw new ODI_Exceptions().new OversException2();
		}
		else if(count<2 && teamOvers>50){
			throw new ODI_Exceptions().new OversException1();
		}
		System.out.println("Enter The Run RATE of "+teamName);
		runRate=s.nextDouble();
		teamScore=(int)(runRate*teamOvers);
		System.out.println(teamName+" Score "+teamScore+"/"+wickets()+" with Current RunRate:"+runRate);
	}
	int wickets(){
		if(count<1){
			if(teamOvers<50){
				return 10;
			}
			else{
				if(teamScore>=350){
					return 9;  
				}
				else if(teamScore>=300 && teamScore<350){
					return 8; 
				}	 
				else if(teamScore>=250 && teamScore<300){
					return 7;	
				}
				else if(teamScore>=150 && teamScore<250){
					return 6;
				}
				else
					return 5;

			}
		}
		else{
			if(teamOvers<40){
				return 10;
			}
			else{
				if(teamScore>=350){
					return 9;  
				}
				else if(teamScore>=300 && teamScore<350){
					return 8; 
				}	 
				else if(teamScore>=250 && teamScore<300){
					return 7;	
				}
				else if(teamScore>=150 && teamScore<250){
					return 6;
				}
				else
					return 5;

			}

		}
	}

	void scoreCalculationByUsingOversAndRunRate2()throws Exception{

		System.out.println("Enter the Overs played by "+TeamB.teamName);	
		TeamB.teamOvers=s.nextInt();
		if(TeamB.teamOvers>40 && count>=2){

			throw new ODI_Exceptions().new OversException2();
		}
		else if(count<2 && TeamB.teamOvers>50){
			throw new ODI_Exceptions().new OversException1();
		}
		System.out.println("Enter The Run RATE of "+TeamB.teamName);
		TeamB.runRate=s.nextDouble();
		TeamB.teamScore=(int)(TeamB.runRate*TeamB.teamOvers);
		System.out.println(TeamB.teamName+" Score "+TeamB.teamScore+"/"+wickets2()+" with Current RunRate:"+TeamB.runRate);
	}
	int wickets2(){

		if(TeamA.teamScore>TeamB.teamScore){
			return 10;
		}
		else{
			if(TeamB.teamScore>=350){
				return 9;  
			}
			else if(TeamB.teamScore>=300 && TeamB.teamScore<350){
				return 8; 
			}	 
			else if(TeamB.teamScore>=250 && TeamB.teamScore<300){
				return 7;	
			}
			else if(TeamB.teamScore>=150 && TeamB.teamScore<250){
				return 6;
			}
			else
				return 5;

		}		
	}
	void win()throws Exception{
		if(teamScore>TeamB.teamScore){
			System.out.println(teamName+" Win by "+(teamScore-TeamB.teamScore)+"runs");
		}
		else if(teamScore<TeamB.teamScore){
			System.out.println(TeamB.teamName+" Win by "+(TeamB.teamScore-teamScore)+" runs");
		}
		else{
			throw new ODI_Exceptions().new MatchTieException();
		}
		
	}
}
