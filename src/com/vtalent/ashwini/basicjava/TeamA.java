package com.vtalent.ashwini.basicjava;


public class TeamA
{
		private String teamname;
		private float teamovers;
		private float teamscore;
		private int teamwickets;
		 float runrate;
		public String getTeamname() {
			return teamname;
		}
		public void setTeamname(String teamname) {
			this.teamname = teamname;
		}
		public float getTeamovers() {
			return teamovers;
		}
		public void setTeamovers(float teamovers) {
			this.teamovers = teamovers;
		}
		public float getTeamscore() {
			return teamscore;
		}
		public void setTeamscore(float teamscore) {
			this.teamscore = teamscore;
		}
		public int getTeamwickets() {
			return teamwickets;
		}
		public void setTeamwickets(int teamwickets) {
			this.teamwickets = teamwickets;
		}
		public float runrate()
		{
			if(teamovers==50 & teamwickets<=10)
			{	
			 runrate=teamscore/teamovers;
			 return runrate;
			}
			else
			{
				runrate=0.0f;
				return runrate;
			}
		}

	}


