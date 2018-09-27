package com.vtalent.ashwini.basicjava;

public class Team2 
{
	private String teamname;
	private float teamovers;
	private float teamrunrate;
	private int teamwickets;
	public int runs;
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
	
	public int getTeamwickets() {
		return teamwickets;
	}
	public void setTeamwickets(int teamwickets) {
		this.teamwickets = teamwickets;
	}
	public float getTeamrunrate() {
		return teamrunrate;
	}
	public void setTeamrunrate(float teamrunrate) {
		this.teamrunrate = teamrunrate;
	}
	public int runScored()
	{
		if(teamwickets==10 & teamovers<=50.0)
		{	
		runs=(int)(teamovers*teamrunrate);
		return runs;
		}
		else
		{
			runs=0;
			return runs;
		}
	}
	
}
