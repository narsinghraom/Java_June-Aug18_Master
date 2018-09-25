package com.vtalent.ashwini.basicjava;

import java.util.Scanner;

public class OdiTest 
{
	static float a1,b1,i,j;
	public static void main(String[] args)
	{
		
		TeamA a=new TeamA();
		
		Scanner sc=new Scanner(System.in);
		a.setTeamname(sc.next());
		a.setTeamovers(sc.nextFloat());
		a.setTeamscore(sc.nextFloat());
		a.setTeamwickets(sc.nextInt());
		
		TeamB b=new TeamB();
		
		b.setTeamname1(sc.next());
		b.setTeamovers1(sc.nextFloat());
		b.setTeamscore1(sc.nextFloat());
		b.setTeamwickets1(sc.nextInt());
		
		
		System.out.println("please enter teamA name");
		System.out.println(a.getTeamname());
		System.out.println("please enter teamB name");
		System.out.println(b.getTeamname1());
		System.out.println("welcome to ODI INdia v/s Aus");
		System.out.println("1st innings by team india");
		System.out.println("enter overs played");
		System.out.println(a.getTeamovers());
		a1=a.runrate();
		System.out.println("India scores"+(a.getTeamscore()/a.getTeamwickets())+"with Current runrate:"+a1);
		System.out.println("2nd innings by team aus");
		System.out.println("enter the overs played");
		System.out.println(b.getTeamovers1());
		b1=b.runrate();
		System.out.println("India scores"+(b.getTeamscore1()/b.getTeamwickets1())+"with Current runrate:"+b1);
		i=a.getTeamscore();
		j=b.getTeamscore1();
		System.out.println("India win by "+(i-j)+"...........");

		sc.close();	
		
	
		

	}

}
