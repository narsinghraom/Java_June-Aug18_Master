package com.vtalent.sahithi;



public class TeamA {
	String teamName;
	int Score;
	float teamovers;
	float runrate;
	int teamwickets;
	
	public int score(float overs,float runrate,String name){
		this.teamovers=overs;
		this.runrate=runrate;
		this.teamName=name;
		this.Score=(int) (overs*runrate);
		
		if(teamovers<50){
			teamwickets=10;
		}
			else{
				teamwickets=8;			
		}
		
		System.out.println(this.teamName+"Score "+this.Score+"/"+this.teamwickets+"with current runrate:"+this.runrate);
			return Score;
		}
			
}

			
			
		
		
	
	
	


