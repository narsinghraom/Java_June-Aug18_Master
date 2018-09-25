package com.vtalent.ashwini.basicjava;


public class TeamB
{
		private String teamname1;
		private float teamovers1;
		private float teamscore1;
		private int teamwickets1;
		float runrate;
		public String getTeamname1() {
			return teamname1;
		}
		public void setTeamname1(String teamname1) {
			this.teamname1 = teamname1;
		}
		public float getTeamovers1() {
			return teamovers1;
		}
		public void setTeamovers1(float teamovers1) {
			this.teamovers1 = teamovers1;
		}
		public float getTeamscore1() {
			return teamscore1;
		}
		public void setTeamscore1(float teamscore1) {
			this.teamscore1 = teamscore1;
		}
		public int getTeamwickets1() {
			return teamwickets1;
		}
		public void setTeamwickets1(int teamwickets1) {
			this.teamwickets1 = teamwickets1;
		}
		public float runrate()
		{
			if(teamovers1<50 & teamwickets1<10)
			{
			 runrate=teamscore1/teamovers1;
			 return runrate;
			}
			else	
			{
				runrate=0.0f;
				return runrate;
			}
		}
		
		

	}


