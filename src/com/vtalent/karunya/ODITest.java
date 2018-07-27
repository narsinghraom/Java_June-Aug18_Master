package com.vtalent.karunya;

import java.util.Scanner;

public class ODITest {
	void results()
	{
		System.out.println("enter the teamA score");
		int k=s.nextInt();
		System.out.println("enter the teamB score");
		int k1=s.nextInt();
		int k2=k-k1;
	    System.out.println("india is win");
	}
	Scanner s=new Scanner(System.in);
	public static void main(String[] args){
		TeamB b=new TeamB();
        b.display();
        b.runrate();
        TeamA a=new TeamA();
        a.disp1();
        a.runrate();
       	}
	
}
