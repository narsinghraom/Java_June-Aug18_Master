package com.vtalent.narendar;

public class ODITest{
	
	public static void main(String[] args) throws Exception
	{
					TeamA a=new TeamA();
					TeamB b=new TeamB();
			
				a.weather();
			
				a.teamName();
				
			    b.teamName();
			
System.out.println("Welcome to ODI"+" "+a.teamNameA+" "+"vs"+" "+b.teamNameB);
a.score();
b.score();

 if(a.teamScoreA>b.teamScoreB)
 {
	
	System.out.println(a.teamNameA+" "+"won by"+" "+(a.teamScoreA-b.teamScoreB)+" "+"runs");
 }
 
 if(a.teamScoreA<b.teamScoreB)
 {
	 System.out.println(b.teamNameB+" "+"won by"+" "+(10-b.teamWicketsB)+" "+"wickets");
 }
 
 if(a.teamScoreA==b.teamScoreB)
 {
	 throw new ODIException().new MatchTieException();
 }
 
 }
}