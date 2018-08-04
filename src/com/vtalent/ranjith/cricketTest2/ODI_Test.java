package com.vtalent.ranjith.cricketTest2;

import java.util.Scanner;
public class ODI_Test {
	public static void main(String[] args) throws Exception {
		Scanner s2=new Scanner(System.in);	
		TeamA a=new TeamA();
		a.weather();
		System.out.println("1st Innings By Team "+TeamA.teamName);
		a.scoreCalculationByUsingOversAndRunRate1();
		System.out.println("2nd Innings By Team "+TeamB.teamName);
		a.scoreCalculationByUsingOversAndRunRate2();
		a.win();
		s2.close();
	}

}
