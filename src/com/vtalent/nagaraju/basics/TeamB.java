package com.vtalent.nagaraju.basics;

public class TeamB {
	String team_B_Name;
	float team_B_Overs;
	int team_B_Score;
	int team_B_Wickets;
	public String getTeam_B_Name() {
		return team_B_Name;
	}
	public void setTeam_B_Name(String team_B_Name) {
		this.team_B_Name = team_B_Name;
	}
	public float getTeam_B_Overs() {
		return team_B_Overs;
	}
	public void setTeam_B_Overs(float team_B_Overs) {
		this.team_B_Overs = team_B_Overs;
	}
	public int getTeam_B_Score() {
		return team_B_Score;
	}
	public void setTeam_B_Score(float overs,float runRate) {
		int team_B_Score=(int)(overs*runRate);
		this.team_B_Score = team_B_Score;
	}
	public int getTeam_B_Wickets() {
		return team_B_Wickets;
	}
	public void setTeam_B_Wickets(float team_B_overs) {
		if(team_B_overs==50){
		 int team_B_Wickets=5;
		}else{
		 team_B_Wickets=10;
		System.out.println("all out");
		}
		this.team_B_Wickets = team_B_Wickets;
	}
	
	
	

}
