package com.vtalent.chaithanya;

import java.util.Scanner;

public class ODITest {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		TeamA a = new TeamA();

		TeamB b = new TeamB();

		System.out.println("Please Enter Team-A Name");
		a.teamName = s.nextLine();

		System.out.println("Please Enter Team-B Name");
		b.teamName = s.nextLine();

		System.out.println("Welcome to ODI " + a.teamName + " v/s " + b.teamName);
		System.out.println("1st Innings By Team India");

		// System.out.println("Enter the Overs played");
		// a.teamOvers = s.nextInt();
		a.display();

		System.out.println("Enter the RunRate " + a.teamName);
		a.runRate = s.nextFloat();
		int teamscoreA = a.displayrunRate();
		// System.out.println("Enter The Score of " + a.teamName);
		// a.teamScore = s.nextInt();
		System.out.println("Enter the Wickets of " + a.teamName);
		a.teamWickets = s.nextInt();

		System.out.println(
				"India Score " +teamscoreA + "/" + a.teamWickets + " with Current RunRate:" + a.runRate);
		System.out.println();
		System.out.println("2nd Innings By Team Aus");
		// System.out.println("Enter the Overs played");
		// b.teamOvers = s.nextInt();
		b.display();
		System.out.println("Enter the RunRate " + b.teamName);
		b.runRate = s.nextFloat();
		int teamscoreB = b.displayrunRate();
		// System.out.println("Enter The Score of " + b.teamName);
		// b.teamScore = s.nextInt();
		System.out.println("Enter the Wickets of " + b.teamName);
		b.teamWickets = s.nextInt();
		System.out.println("" + b.teamName + " " + teamscoreB + "/" + b.teamWickets + " with Current RunRate:"
				+ b.runRate);
		if (teamscoreA > teamscoreB) {

			System.out.println(a.teamName + " Win by " + (teamscoreA - teamscoreB) + "runs");
		} else if (teamscoreA < teamscoreB) {
		//	System.out.println(b.teamName + " Win by " + (teamscoreB - teamscoreA) + " runs");
			System.out.println(b.teamName + " Win by  " + (10 - b.teamWickets) + " wickets ");

		} else {
			//System.out.println(b.teamName + " Win by  " + (10 - b.teamWickets) + " wickets ");
          System.out.println("No result");
		}
		// {if (a.teamOvers == b.teamOvers)
		// {
		// System.out.println(b.teamName + " Need " + (a.teamScore -
		// b.teamScore) + " runs to win in "
		// + (a.teamOvers - b.teamOvers) + " overs");
		//
		// } else if (a.teamOvers != b.teamOvers){
		// System.out.println(a.teamName + " Win by " + (b.teamWickets -
		// a.teamWickets) + " wickets");
		//
		// }
		// if (a.teamScore < b.teamScore)
		// {
		// System.out.println(b.teamName + " Win by " + (b.teamScore -
		// a.teamScore) + " runs");
		// }
		// else {
		// System.out.println(b.teamName + " Win by " + (10 - b.teamWickets) + "
		// wickets ");
		//
		// }

		// if(a.teamScore > b.teamScore)
		// {
		// System.out.println(a.teamName+" win by
		// "+(a.teamScore-b.teamScore)+"runs");
		// }
		// else {
		// System.out.println(b.teamName+" win by "+( 10 - b.teamWickets )+"
		// Wickets");
		// }

		// if (a.teamScore == b.teamScore) {
		// System.out.println("No Result");
		// }

		s.close();
	}
}
