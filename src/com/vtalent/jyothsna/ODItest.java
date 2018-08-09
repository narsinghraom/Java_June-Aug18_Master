package com.vtalent.jyothsna;

import java.util.Scanner;

public class ODItest {
	public static void main(String args[]) {
	TeamA a=new TeamA();
	

 Scanner s=new Scanner(System.in);
 System.out.println("please enter the TeamA name");
 String TeamAname =s.next();

 TeamB b=new TeamB();
 System.out.println("please enter the TeamB name");
 String name =s.next();
 
 System.out.println("welcom to ODI"+" "+TeamAname+ "vs"+name);
 System.out.println("1st Innings By"  +TeamAname);
 a.function();
 System.out.println("enter the team score");
 a.TeamAScore=s.nextDouble();
 System.out.println("enter the wickets");
 a.TeamAwickets=s.nextDouble();
 System.out.println(TeamAname+"scores" +a.TeamAScore+"/"+a.TeamAwickets+ "v/s"+"with runrate:"+a.runrate1());
 System.out.println("2nd innings by "+name);
 b.fuction2();
 System.out.println("enter the team score");
 b.Score=s.nextDouble();
 System.out.println("enter the wickets");
 b.wickets=s.nextDouble();
 System.out.println(name+"scores" +b.Score+"/"+b.wickets+ "v/s"+"with runrate:"+b.runrate2());
if(a.TeamAScore>b.Score)
{
	System.out.println(TeamAname+"win by"+ (a.TeamAScore-b.Score) +"Runs");
}
else
	System.out.println(name+"win by"+(a.TeamAScore-b.Score)+"Runs");
	
	}
}
 
			

	
		

