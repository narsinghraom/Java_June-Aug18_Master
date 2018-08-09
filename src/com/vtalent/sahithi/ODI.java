package com.vtalent.sahithi;
import java.util.Scanner;
public class ODI {
	public static void main(String[] args) throws Exception{
		Scanner s2=new Scanner(System.in);	
		TeamA1 a=new TeamA1();
		a.weather();
		System.out.println("1st Innings By Team "+TeamA1.teamName);
		a.scoreCalculationByUsingOversAndRunRate1();
		System.out.println("2nd Innings By Team "+TeamB1.teamName);
		a.scoreCalculationByUsingOversAndRunRate2();
		a.win();
		s2.close();
	}
		
	}
	
