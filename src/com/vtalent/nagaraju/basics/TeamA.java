package com.vtalent.nagaraju.basics;

public class TeamA {
	String team_A_Name;
	float team_A_Overs;
	int team_A_Score;
	int team_A_Wickets;
	public String getTeam_A_Name() {
		return team_A_Name;
	}
	public void setTeam_A_Name(String team_A_Name) {
		this.team_A_Name = team_A_Name;
	}
	public float getTeam_A_Overs() {
		return team_A_Overs;
	}
	public void setTeam_A_Overs(float team_A_Overs) {
		this.team_A_Overs = team_A_Overs;
	}
	public int getTeam_A_Score() {
		return team_A_Score;
	}
	public void setTeam_A_Score(float overs,float runRate) {
		int team_A_Score= (int) (overs*runRate);
		this.team_A_Score = team_A_Score;
	}
	public int getTeam_A_Wickets() {
		return team_A_Wickets;
	}
	public void setTeam_A_Wickets(float  overs) {
		if(overs==50){
			team_A_Wickets=8;
		}System.out.println("all out ");
		int team_A_Wickets=10;
		this.team_A_Wickets = team_A_Wickets;
	}
	

}
